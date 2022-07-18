package routeAPI;

public class CarRoute extends RouteStrategy{

    public CarRoute(){
        this.travelSpeed = 30.5;
        this.fuelConsumption = 0.45;
    }

    @Override
    protected double fuelConsumption(double distance) {
        return fuelConsumption * distance;
    }
    
}
