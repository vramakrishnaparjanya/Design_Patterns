public class Circle implements Shape{

    // intrinsic parameter
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing circle with coordinates --> " + x + ", " + y);
    }
}
