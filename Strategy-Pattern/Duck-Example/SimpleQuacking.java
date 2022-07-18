/**
 * Specific implementation of the `quacking` strategy.
 * Concrete instances of this are to be injected into the constructor
 * of the client class, whenever this strategy (behavior) is
 * wished to be used.
 * 
 */

public class SimpleQuacking implements IQuackingStrategy{
    /**
     * Implementation of the algorithm for this strategy...
     */
    public void quack(){
        System.out.println("Simple quack...");
    }
}
