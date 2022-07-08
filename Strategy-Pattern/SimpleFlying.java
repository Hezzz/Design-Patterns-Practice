/**
 * Specific implementation of the `flying` strategy.
 * Concrete instances of this are to be injected into the constructor
 * of the client class, whenever this strategy (behavior) is
 * wished to be used.
 * 
 */

public class SimpleFlying implements IFlyingStrategy{
    /**
     * Implementation of the algorithm for this strategy...
     */
    public void fly(){
        System.out.println("Simple flying...");
    }
}
