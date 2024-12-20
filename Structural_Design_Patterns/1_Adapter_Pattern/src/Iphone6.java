public class Iphone6 implements Iphone{

    Iphone4ToIphone6Adapter iphone4ToIphone6Adapter;

    Iphone6(Charger charger)
    {
        this.iphone4ToIphone6Adapter = (Iphone4ToIphone6Adapter) charger;
    }

    @Override
    public void phone_charging() {
        iphone4ToIphone6Adapter.charge();
    }
}
