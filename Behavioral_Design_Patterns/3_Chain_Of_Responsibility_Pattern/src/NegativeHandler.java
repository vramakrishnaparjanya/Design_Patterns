class NegativeHandler extends NumberHandler {
    @Override
    public void handleRequest(int number) {
        if (number < 0) {
            System.out.println("NegativeHandler: Handling negative number: " + number);
        } else if (numberHandler != null) {
            super.numberHandler.handleRequest(number);
        }
    }
}