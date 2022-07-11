public class StrokeShapeDecorator extends ShapeDecorator {

    public StrokeShapeDecorator(Shape shape, String color){
        super(shape, color);
    }

    @Override
    public void draw() {
        this.shape.draw();
        strokeColor();
    }

    private void strokeColor(){
        System.out.println("Stroked with " + color);
    }
    
}
