class ZeroHandler extends NumberHandler {
    @Override
    public void handleRequest(int number) {
        if (number == 0) {
            System.out.println("ZeroHandler: Handling zero.");
        } else if (numberHandler != null) {
            super.numberHandler.handleRequest(number);
        }
    }
}