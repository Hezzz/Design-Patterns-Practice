import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.InputMismatchException;

import dbAPI.NavDB;
import routeAPI.BikingRoute;
import routeAPI.CarRoute;
import routeAPI.Location;
import routeAPI.RouteStrategy;

public class NavUI {

    private final NavDB navDB;
    private final Navigator navigator;
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public NavUI(){
        this.navDB = new NavDB();
        this.navigator = new Navigator();
    }

    public void loadUI() throws NumberFormatException, IOException{
        System.out.println("---------NavApp---------");
        HashMap<Integer, Location> locations = navDB.getLocations();
        RouteStrategy routeStrategy;
        
        System.out.println("From: ");
        printLocations(locations);
        int fromChoice = Integer.parseInt(reader.readLine());

        System.out.println("To: ");
        printLocations(locations);
        int toChoice = Integer.parseInt(reader.readLine());

        System.out.println("Choose transportation method: \n[1] Bike\n[2] Car");
        int transpChoice = Integer.parseInt(reader.readLine());
        switch(transpChoice){
            case 1: routeStrategy = new BikingRoute(); break;
            case 2: routeStrategy = new CarRoute(); break;
            default: throw new InputMismatchException();
        }

        navigator.setRouteStrategy(routeStrategy);
        navigator.printRouteDetails(locations.get(fromChoice), locations.get(toChoice));

        System.out.println("---------NavApp---------");
    }

    private void printLocations(HashMap<Integer, Location> locations){
        locations.forEach((index, location) -> 
        System.out.println("[" + index + "] " + location.getName()));
    }
}
