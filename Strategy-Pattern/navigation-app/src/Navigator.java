import routeAPI.Location;
import routeAPI.RouteStrategy;

public class Navigator {
    private RouteStrategy strategy;

    public void setRouteStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }

    public void printRouteDetails(Location locationA, Location locationB){
        strategy.printRouteDetails(locationA, locationB);
    }

}
