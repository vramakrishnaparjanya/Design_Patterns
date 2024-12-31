public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cream";
    }

    @Override
    public double getCost() {
        // Adding extra cream cost to coffee
        return super.getCost() + 5.0;
    }
}
