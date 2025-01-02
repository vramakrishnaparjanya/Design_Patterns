public class User {

    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        this.mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(this.name + " receives: " + message);
    }


}
