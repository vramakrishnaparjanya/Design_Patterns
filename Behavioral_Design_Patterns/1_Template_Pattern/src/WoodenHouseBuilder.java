// 2. Concrete Classes (WoodenHouseBuilder, ConcreteHouseBuilder)
class WoodenHouseBuilder extends HouseBuilder {
    @Override
    public void prepareFoundation() {
        System.out.println("Preparing wooden foundation.");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls.");
    }

    @Override
    public void installRoof() {
        System.out.println("Installing a wooden roof.");
    }
}