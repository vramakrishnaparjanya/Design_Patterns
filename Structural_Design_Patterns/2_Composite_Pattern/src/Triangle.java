
// 2. Leaf objects
public class Triangle implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Draw Triangle with color --> "+fillColor);
    }
}
