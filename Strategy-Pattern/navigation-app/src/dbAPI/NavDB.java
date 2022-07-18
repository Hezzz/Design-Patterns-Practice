package dbAPI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import routeAPI.Location;

public class NavDB {
    private final String FILENAME = "data\\locations.json";
    private static final HashMap<Integer, Location> locations = new HashMap<Integer, Location>();

    public void loadDB(){
        JSONParser parser = new JSONParser();
        try {
            JSONArray locationsJSON = (JSONArray) parser.parse(new FileReader(FILENAME));
            int key = 1;
            for (Object loc : locationsJSON) {
                JSONObject locationJSON = (JSONObject) loc;
                String name = (String) locationJSON.get("name");
                double latitude = (double) locationJSON.get("latitude");
                double longitude = (double) locationJSON.get("longitude");

                Location location = new Location(name, latitude, longitude);
                locations.put(key, location);
                key++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(FILENAME + " not found...");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Parsing error... check file data");
        }
    }

    public HashMap<Integer, Location> getLocations(){
        if(locations == null){
            loadDB();
        }
        return new HashMap<Integer, Location>(locations);
    }
}
