class ConcreteHouseBuilder extends HouseBuilder {
    @Override
    public void prepareFoundation() {
        System.out.println("Preparing concrete foundation.");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building concrete walls.");
    }

    @Override
    public void installRoof() {
        System.out.println("Installing a concrete roof.");
    }

    @Override
    public void installWindows() {
        System.out.println("Installing reinforced windows."); //Override the default window installation
    }
}