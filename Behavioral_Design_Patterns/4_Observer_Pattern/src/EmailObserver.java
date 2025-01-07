public class EmailObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Email observer --> Message received --> "+ message);
    }
}
