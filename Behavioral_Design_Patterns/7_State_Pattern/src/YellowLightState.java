public class YellowLightState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Yellow Light: Prepare to stop!");
    }
}
