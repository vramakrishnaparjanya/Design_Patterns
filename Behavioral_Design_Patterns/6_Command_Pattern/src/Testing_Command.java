public class Testing_Command {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete Commands
        Command_Interface turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command_Interface turnOffLight = new TurnOffLightCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(turnOnLight);
        remote.pressButton();

        // Turn the light OFF
        remote.setCommand(turnOffLight);
        remote.pressButton();
    }
}
