public class Main {
    public static void main(String[] args) {
        TruckLogistics truckLogistics = new TruckLogistics();
        ShipLogistics shipLogistics = new ShipLogistics();

        ITransportation truck = truckLogistics.createTransport();
        ITransportation ship = shipLogistics.createTransport();

        truck.deliver();
        ship.deliver();
    }
}
