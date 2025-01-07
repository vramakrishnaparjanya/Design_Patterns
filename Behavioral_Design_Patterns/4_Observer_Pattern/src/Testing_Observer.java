public class Testing_Observer {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer emailObserver = new EmailObserver();
        Observer smsObserver = new SMSObserver();
        Observer notificationObserver = new NotificationObserver();

        subject.attach(emailObserver);
        subject.attach(smsObserver);
        subject.attach(notificationObserver);

        // Notify Observers with a message
        System.out.println("Sending First Notification:");
        subject.notifyObservers("System update at 12:00 AM");
        System.out.println("\n");

        // Detach an observer and send another notification
        subject.detach(smsObserver);
        System.out.println("Sending Second Notification:");
        subject.notifyObservers("Server maintenance scheduled for 2:00 AM");

    }
}
