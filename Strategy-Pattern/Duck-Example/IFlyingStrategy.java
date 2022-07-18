/**
 * General strategy (behavior) of the client class as an interface. 
 * Subclasses of this strategy will have distinct implementations
 * of the indicated behavior (i.e. flying)
 * 
 */

public interface IFlyingStrategy {
    /**
     * Algorithm to be implemented...
     */
    public void fly();
}
