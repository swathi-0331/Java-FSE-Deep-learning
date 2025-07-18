public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Swathi H U"));
        context.executePayment(1500.00);

        // Switching to PayPal
        context.setPaymentStrategy(new PayPalPayment("swathi@example.com"));
        context.executePayment(800.00);
    }
}
