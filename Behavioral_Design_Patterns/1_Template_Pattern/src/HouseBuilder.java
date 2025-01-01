// 1. Abstract Class (HouseBuilder)
public abstract class HouseBuilder {

    // Template method (defines the algorithm's skeleton)
    public final void buildHouse() {
        prepareFoundation();
        buildWalls();
        installRoof();
        installWindows();
        System.out.println("House built!");
    }

    // Abstract methods (subclasses must implement these)
    public abstract void prepareFoundation();
    public abstract void buildWalls();
    public abstract void installRoof();

    // Concrete method (optional, provides default behavior)
    public void installWindows() {
        System.out.println("Installing standard windows.");
    }
}
