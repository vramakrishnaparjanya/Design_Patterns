public class StaticBlockSingleton {
    // similar to eager initialization but with exception handling

    private static StaticBlockSingleton instance;

    // Block constructor
    private StaticBlockSingleton(){}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    // Testing class
    public static class testing {
        public static void main(String[] args) {
            StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
            StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();

            // Will return same instance hashcode
            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());

        }
    }
}
