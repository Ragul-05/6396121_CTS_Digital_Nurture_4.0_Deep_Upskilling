package Design_Principles_and_Patterns.StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012", "Ragul");
        context.setPaymentStrategy(creditCard);
        context.payAmount(500.0);

        // Pay using PayPal
        PaymentStrategy paypal = new PayPalPayment("ragul@email.com");
        context.setPaymentStrategy(paypal);
        context.payAmount(1200.0);
    }
}