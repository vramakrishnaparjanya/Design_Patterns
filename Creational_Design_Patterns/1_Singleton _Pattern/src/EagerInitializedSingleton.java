public class EagerInitializedSingleton {

    // instance is created in class loading time
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //Block constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    // Testing class
    public static class testing {
        public static void main(String[] args) {
            EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
            EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();

            // Will return same instance hashcode
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());

        }
    }
}
