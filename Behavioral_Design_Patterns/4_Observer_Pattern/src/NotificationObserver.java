public class NotificationObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Notification Observer--> Message received --> "+ message);
    }
}
