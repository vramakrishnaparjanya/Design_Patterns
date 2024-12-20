public class Testing_Adapter {

    public static void main(String[] args) {

        Iphone6 iphone6 = new Iphone6(new Iphone4ToIphone6Adapter());
        iphone6.phone_charging();

    }

}
