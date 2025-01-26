public class Testing_Visitor {

    public static void main(String[] args) {


        ItemElement[] items = new ItemElement[]{
                new Book("Java Design Patterns", 20.0),
                new Book("Clean Code", 15.5),
                new Fruit("Apple", 2.0, 1.5),
                new Fruit("Banana", 1.5, 2.0)
        };

        ShoppingCartVisitor visitor = new ShoppingCartVisitor();

        for (ItemElement item : items) {
            item.accept(visitor);
        }

        System.out.println("Total Cost: $" + visitor.getTotalCost());
    }
}
