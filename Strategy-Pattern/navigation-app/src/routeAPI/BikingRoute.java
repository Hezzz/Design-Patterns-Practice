package routeAPI;

public class BikingRoute extends RouteStrategy{

    public BikingRoute(){
        this.travelSpeed = 10.5;
    }

    @Override
    protected double fuelConsumption(double distance) {
        return this.fuelConsumption;
    }
    
}
