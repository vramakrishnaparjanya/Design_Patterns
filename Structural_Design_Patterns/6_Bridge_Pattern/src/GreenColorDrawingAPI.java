public class GreenColorDrawingAPI implements DrawingAPI{
    @Override
    public void drawSquare(int x, int y, int side) {
        System.out.println("Drawing a Green Square --> "+ x + "," + y + "," + side);
    }

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing a Green Circle --> "+ x + "," + y + "," + radius);
    }
}
