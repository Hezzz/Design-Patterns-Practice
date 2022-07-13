public class TruckLogistics implements Logistics{
    @Override
    public ITransportation createTransport() {
        return new TruckTransportation();
    }
}
