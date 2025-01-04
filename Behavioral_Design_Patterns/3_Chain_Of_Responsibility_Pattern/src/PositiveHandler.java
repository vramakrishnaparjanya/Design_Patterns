class PositiveHandler extends NumberHandler {
    @Override
    public void handleRequest(int number) {
        if (number > 0) {
            System.out.println("PositiveHandler: Handling positive number: " + number);
        } else if (numberHandler != null) {
            super.numberHandler.handleRequest(number);
        }
    }
}