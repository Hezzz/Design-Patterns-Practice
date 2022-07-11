public class FillShapeDecorator extends ShapeDecorator{

    public FillShapeDecorator(Shape shape, String color){
        super(shape, color);
    }

    @Override
    public void draw() {
        this.shape.draw();
        fillColor();
    }

    // This is a pseudo-implementation of the desired behavior
    // of a decorator class.
    private void fillColor() {
        System.out.println("Filled with " + color);
    }
    
}
