
// 2. Leaf objects
public class Circle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Draw Circle with color --> "+fillColor);
    }
}
