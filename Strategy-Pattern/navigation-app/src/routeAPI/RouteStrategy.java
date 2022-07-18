package routeAPI;

public abstract class RouteStrategy {
    // distance is represented as km
    protected double travelSpeed = 0;       //kph
    protected double fuelConsumption = 0;   //L/km

    protected abstract double fuelConsumption(double distance);

    public void printRouteDetails(Location locationA, Location locationB) {
        double distance = locationA.distanceFrom(locationB) * 1000;
        double fuelConsumption = fuelConsumption(distance);
        double time = distance / travelSpeed;

        System.out.println("From " + locationA.getName() + " to " + locationB.getName());
        System.out.println("Distance: " + distance + "km");
        System.out.println("Estimated travel time: " + time + " hours");
        System.out.println("Fuel consumption: " + fuelConsumption + "L");
    }
}
