package Week_1_Design_Principles_and_Patterns_HandsOn.AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(150.0);

        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(250.0);
    }
}
