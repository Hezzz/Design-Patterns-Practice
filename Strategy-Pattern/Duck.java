/**
 * Client class of the strategies (behaviors) to be implemented.
 * Using this design pattern, there is no inherent need to subclass
 * the client class to implement specific behavior per subclass.
 * Instead, compose a set of strategies (behaviors) in the client class.
 * 
 * The result is the same with inheritance but reuse of 
 * strategies (behaviors) is better handled 
 * 
 */

 public class Duck{
    // Make instances of the strategies in the client class
    private final IQuackingStrategy quackingStrategy;
    private final IFlyingStrategy flyingStrategy;

    // specific strategy type will be injected to the constructor as wished
    public Duck(IQuackingStrategy quackingStrategy, IFlyingStrategy flyingStrategy){
        this.quackingStrategy = quackingStrategy;
        this.flyingStrategy = flyingStrategy;
    }

    // Use the instances of the strategies to call out the 
    // needed method for each behavior of the client

    public void quack(){
        quackingStrategy.quack();
    }

    public void fly(){
        flyingStrategy.fly();
    }
 }
