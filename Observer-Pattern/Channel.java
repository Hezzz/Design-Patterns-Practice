public class Channel extends Observable{
    @Override
    public void post(String post) {
        this.post = "New video uploaded: " + post;
        notifyObservers();
    }
}
