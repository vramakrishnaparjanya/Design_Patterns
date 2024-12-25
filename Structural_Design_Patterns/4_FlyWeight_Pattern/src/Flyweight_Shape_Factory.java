import java.util.HashMap;

public class Flyweight_Shape_Factory {

    public static final HashMap<String, Shape> circlesMap = new HashMap<>();

    public static Shape getCircle(String color){

        Circle circle = (Circle) circlesMap.get(color);

        if(circle==null){
            System.out.println("Circle does not exist, so creating");
            circle = new Circle(color);
            circlesMap.put(color, circle);
            System.out.println("Circle created with color --> "+color);
        }
        return circle;
    }

}
