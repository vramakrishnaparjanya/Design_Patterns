public class Testing_TrafficState {

    public static void main(String[] args) {

        State redLightState = new RedLightState();
        State yellowLightState = new YellowLightState();
        State greenLightState = new GreenLightState();

        TrafficLight_Context trafficLightContext = new TrafficLight_Context();

        // no light
        trafficLightContext.applyState();

        //red light
        trafficLightContext.setState(redLightState);
        trafficLightContext.applyState();

        // yellow light
        trafficLightContext.setState(yellowLightState);
        trafficLightContext.applyState();

        //green light
        trafficLightContext.setState(greenLightState);
        trafficLightContext.applyState();

    }

}
