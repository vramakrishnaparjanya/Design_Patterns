
//2. Shape implementations - Circle
public class Circle implements Shape{

    private final int x, y, radius;
    private final DrawingAPI drawingAPI;

    public Circle(int x, int y, int radius, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle ... ");
        drawingAPI.drawCircle(x, y, radius);
    }
}
