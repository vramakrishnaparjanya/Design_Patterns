public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public  static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    //Testing class
    public static class testing {
        public static void main(String[] args) {
            ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

            // Will return same instance hashcode
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());

        }
    }

}
