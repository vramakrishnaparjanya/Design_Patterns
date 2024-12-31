
// Abstract decorator class for other sub classes
public abstract class CoffeeDecorator implements Coffee{

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return this.decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost();
    }
}
