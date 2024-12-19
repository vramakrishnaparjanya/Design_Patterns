import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long UUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // Works fine until you deserialize the object --> which will return a new instance
}
