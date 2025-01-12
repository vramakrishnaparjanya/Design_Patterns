public class Testing_Strategy {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new VisaCardPayment("9-1-1"));
        shoppingCart.checkout(1000);

        shoppingCart.setPaymentStrategy(new PaypalPayment("test@email.com"));
        shoppingCart.checkout(2000);




    }
}
