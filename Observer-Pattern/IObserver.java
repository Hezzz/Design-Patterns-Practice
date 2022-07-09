/**
 * For this IObserver interface, the update method takes in an Observable
 * to retrieve data from it instead of coupling an IObserver object to
 * a specific Observable object.
 * 
 * I want to achieve here is that an IObserver object can get data from
 * any Observable objects it subscribes to.
 */

public interface IObserver {
    public void update(Observable observable);
}
