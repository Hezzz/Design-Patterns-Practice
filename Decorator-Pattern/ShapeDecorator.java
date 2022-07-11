/**
 * The abstract `decorator` class.
 * This class should have an instance of the `Shape` it decorates
 * then calls its `draw` method whenever this decorator's `draw`
 * method is invoked. Additional 'decorating' behaviors are then
 * invoked.
 */

public abstract class ShapeDecorator implements Shape{
    protected Shape shape;
    protected String color;

    public ShapeDecorator(Shape shape, String color){
        this.shape = shape;
        this.color = color;
    }

    public abstract void draw();
}
