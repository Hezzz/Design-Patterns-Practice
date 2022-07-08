public class Main {
    public static void main(String[] args) {
        Duck simpleDuck = new Duck(new SimpleQuacking(), new SimpleFlying());
        Duck rubberDuck = new Duck(new NoQuacking(), new NoFlying());
        Duck silentDuck = new Duck(new NoQuacking(), new SimpleFlying());
        Duck groundDuck = new Duck(new SimpleQuacking(), new NoFlying());

        System.out.println("Simple duck...");
        simpleDuck.quack();
        simpleDuck.fly();

        System.out.println("\nRubber duck...");
        rubberDuck.quack();
        rubberDuck.fly();

        System.out.println("\nSilent duck...");
        silentDuck.quack();
        silentDuck.fly();

        System.out.println("\nGround duck...");
        groundDuck.quack();
        groundDuck.fly();
    }
}
