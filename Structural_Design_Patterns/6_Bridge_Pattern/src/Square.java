
//2. Shape implementations - Square
public class Square implements Shape{

    private final int x, y, side;
    private final DrawingAPI drawingAPI;

    public Square(int x, int y, int side, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.side = side;
        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square .... ");
        drawingAPI.drawSquare(x, y, side);
    }
}
