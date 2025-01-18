public class GreenLightState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Green Light: Go!!");
    }
}
