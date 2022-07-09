public class Main {
    public static void main(String[] args) {
        Subscriber jeff = new Subscriber();
        Subscriber tom = new Subscriber();

        Channel vChannel = new Channel();
        Blog bBlog = new Blog();

        vChannel.registerObserver(jeff);
        bBlog.registerObserver(jeff);
        bBlog.registerObserver(tom);

        vChannel.post("HELLO WORLD NEW VIDEO!");
        bBlog.post("NEW WORLD NEW BLOG!");

    }
}
