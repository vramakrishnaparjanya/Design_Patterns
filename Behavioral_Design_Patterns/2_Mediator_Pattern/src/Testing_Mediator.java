public class Testing_Mediator {
    public static void main(String[] args) {

        Mediator mediator = new ChatRoom();

        User user1 = new User("John", mediator);
        User user2 = new User("Ram", mediator);
        User user3 = new User("Krishna", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hi! I am John, Welcome to the chat");
        user2.send("Hey!! John, glad to have you here");

    }
}
