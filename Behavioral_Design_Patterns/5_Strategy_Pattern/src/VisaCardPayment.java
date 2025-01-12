public class VisaCardPayment implements PaymentStrategy{
    private String cardNumber;

    public VisaCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Visa Card payment of --> "+ amount + " with card --> "+ cardNumber);
    }
}
