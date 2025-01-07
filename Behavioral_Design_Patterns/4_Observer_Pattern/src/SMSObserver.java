public class SMSObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("SMS Observer --> Message received --> "+ message);
    }
}
