public class BillPughSingleton {

    private BillPughSingleton(){
    }

    private static class SingleTonHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingleTonHelper.instance;
    }
}
