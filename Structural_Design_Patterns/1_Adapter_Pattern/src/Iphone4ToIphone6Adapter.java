public class Iphone4ToIphone6Adapter implements Charger {

    Iphone4Charger iphone4Charger;

    public Iphone4ToIphone6Adapter() {
        iphone4Charger = new Iphone4Charger();
    }

    @Override
    public void charge() {
        System.out.println("Inside Adapter charge");
        iphone4Charger.charge();
    }
}
