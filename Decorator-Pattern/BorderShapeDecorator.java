public class BorderShapeDecorator extends ShapeDecorator {

    public BorderShapeDecorator(Shape shape, String color){
        super(shape, color);
    }

    @Override
    public void draw() {
        this.shape.draw();
        borderColor();
    }

    // This is a pseudo-implementation of the desired behavior
    // of a decorator class.
    private void borderColor(){
        System.out.println("Bordered with " + color);
    }
    
}
