public class Subscriber implements IObserver{

    @Override
    public void update(Observable observable) {
        observable.getNotifMessage();
    }
    
}
