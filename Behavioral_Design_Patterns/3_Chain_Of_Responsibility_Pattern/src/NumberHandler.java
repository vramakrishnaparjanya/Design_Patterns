public abstract class NumberHandler {

    protected NumberHandler numberHandler;

    public void setNextHandler(NumberHandler numberHandler) {
        this.numberHandler = numberHandler;
    }

    public abstract void handleRequest(int number);

}
