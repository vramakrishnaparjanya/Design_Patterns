public class Test_Flyweight {

    public static void main(String[] args) {

        Shape redCircle1 = Flyweight_Shape_Factory.getCircle("Red");
        redCircle1.draw(10, 20);

        Shape redCircle2 = Flyweight_Shape_Factory.getCircle("Red");
        redCircle2.draw(30, 40);

        Shape blueCircle = Flyweight_Shape_Factory.getCircle("Blue");
        blueCircle.draw(50, 60);

        // Notice that the Red circle is reused
        System.out.println("Number of unique circle objects created: " + Flyweight_Shape_Factory.circlesMap.size());

    }

}
