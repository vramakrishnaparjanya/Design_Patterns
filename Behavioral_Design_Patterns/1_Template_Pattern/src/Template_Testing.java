// Client Code (Example Usage)
public class Template_Testing {
    public static void main(String[] args) {
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        woodenHouseBuilder.buildHouse();

        System.out.println("\n");

        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        concreteHouseBuilder.buildHouse();
    }
}
