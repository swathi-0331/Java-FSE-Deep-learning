public class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter();
        payPalProcessor.processPayment(1500.0);

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(2200.0);
    }
}
