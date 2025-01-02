import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator{

    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {

        for(User user1 : users){
            if(user1!=user){
                user1.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
