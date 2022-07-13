public class ShipLogistics implements Logistics{
    @Override
    public ITransportation createTransport() {
        return new ShipTransportation();
    }
}
