import java.util.ArrayList;
import java.util.List;

//2. Subject
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    // Add an observer
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Remove an observer
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }


}
