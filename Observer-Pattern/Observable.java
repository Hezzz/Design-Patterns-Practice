/**
 * The Observer pattern was quite easy to understand and implement.
 * For this scenario, I would be modelling a media (e.g. YouTube channel, blog, etc.)
 * as an observable. Behaviors such as `post` & `getNotifMessage` is added and to be
 * overriden by subclasses.
 */

import java.util.ArrayList;

public abstract class Observable{

    private final ArrayList<IObserver> observers;
    protected String post;

    public Observable(){
        this.observers = new ArrayList<IObserver>();
    }

    public void registerObserver(IObserver observer){
        observers.add(observer);
    }

    public void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    protected void notifyObservers(){
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }

    public abstract void post(String post);

    // The return type of this method could be any, depending
    // on how each subscriber will use it
    public void getNotifMessage(){
        System.out.println(post);
    }

}
