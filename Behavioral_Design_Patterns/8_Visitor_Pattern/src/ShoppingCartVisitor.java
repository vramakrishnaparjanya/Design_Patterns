// ShoppingCartVisitor.java
public class ShoppingCartVisitor implements Visitor {
    private double totalCost = 0;

    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + ", Price: $" + book.getPrice());
        totalCost += book.getPrice();
    }

    @Override
    public void visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit: " + fruit.getName() + ", Cost: $" + cost);
        totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}