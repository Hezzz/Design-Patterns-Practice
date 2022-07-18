/**
 * General strategy (behavior) of the client class as an interface. 
 * Subclasses of this strategy will have distinct implementations
 * of the indicated behavior (i.e. quacking)
 * 
 */

public interface IQuackingStrategy {
    /**
     * Algorithm to be implemented...
     */
    public void quack();
}
