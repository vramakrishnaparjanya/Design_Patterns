public class BridgePatternTest {
    public static void main(String[] args) {

        Shape redCircle = new Circle(5,5,5, new RedColorDrawingAPI());
        Shape greenCircle = new Circle(15,15,15, new GreenColorDrawingAPI());

        Shape redSquare = new Square(10,10,10, new RedColorDrawingAPI());
        Shape greenSquare = new Square(20,20,20, new GreenColorDrawingAPI());


        redCircle.draw();
        greenCircle.draw();

        redSquare.draw();
        greenSquare.draw();


    }
}
