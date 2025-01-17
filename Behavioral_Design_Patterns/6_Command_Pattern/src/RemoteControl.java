// Invoker
class RemoteControl {
    private Command_Interface command;

    public void setCommand(Command_Interface command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}