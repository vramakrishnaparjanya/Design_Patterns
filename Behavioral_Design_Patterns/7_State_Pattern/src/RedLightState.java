public class RedLightState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Red Light: Stop!");
    }
}
