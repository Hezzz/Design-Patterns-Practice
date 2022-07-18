package routeAPI;

public class Location {
    private final String name;
    private final double latitude;
    private final double longitude;

    public Location(String name, double latitude, double longitude){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName(){
        return this.name;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getLongitude(){
        return this.longitude;
    }

    // simple implementation of distance from locA to locB
    // using the distance formula; irl is more complicated
    public double distanceFrom(Location locationB){
        double latitudeB = locationB.getLatitude();
        double longitudeB = locationB.getLongitude();
        return Math.sqrt(Math.pow(latitude - latitudeB, 2) 
                       + Math.pow(longitude - longitudeB, 2));
    }

}
