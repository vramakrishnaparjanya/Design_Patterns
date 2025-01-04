public class Testing_COR {
    public static void main(String[] args) {

        // Create handlers
        NumberHandler negativeHandler = new NegativeHandler();
        NumberHandler zeroHandler = new ZeroHandler();
        NumberHandler positiveHandler = new PositiveHandler();

        // Set up the chain
        negativeHandler.setNextHandler(zeroHandler);
        zeroHandler.setNextHandler(positiveHandler);

        // Test with different numbers
        System.out.println("Testing -5:");
        negativeHandler.handleRequest(-5);

        System.out.println("\nTesting 0:");
        negativeHandler.handleRequest(0);

        System.out.println("\nTesting 10:");
        negativeHandler.handleRequest(10);

    }
}
