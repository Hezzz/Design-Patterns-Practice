public class Blog extends Observable{
    @Override
    public void post(String post) {
        this.post = "New blog posted: " + post;
        notifyObservers();
    }
}
