public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        FillShapeDecorator filledRedCircle = new FillShapeDecorator(circle, "red");
        BorderShapeDecorator borderedGreenFilledRedCircle = new BorderShapeDecorator(filledRedCircle, "green");
        borderedGreenFilledRedCircle.draw();

        System.out.println("\n");

        StrokeShapeDecorator strokedYellowSquare = new StrokeShapeDecorator(square, "yellow");
        FillShapeDecorator filledWhiteStrokedYellowSquare = new FillShapeDecorator(strokedYellowSquare, "white");
        filledWhiteStrokedYellowSquare.draw();
    }
}
