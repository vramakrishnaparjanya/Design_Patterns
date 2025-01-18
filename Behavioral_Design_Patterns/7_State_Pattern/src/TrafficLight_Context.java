public class TrafficLight_Context {

    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void applyState(){
        if(state!=null)
            state.handleRequest();
        else
            System.out.println("Traffic Light is not set at All !!!!");
    }

}
