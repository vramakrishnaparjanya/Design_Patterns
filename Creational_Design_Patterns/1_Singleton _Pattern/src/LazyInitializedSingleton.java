public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    //Testing class
    public static class testing {
        public static void main(String[] args) {
            LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
            LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();

            // Will return same instance hashcode
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());

        }
    }

}
