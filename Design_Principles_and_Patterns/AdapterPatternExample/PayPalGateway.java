package Design_Principles_and_Patterns.AdapterPatternExample;

public class PayPalGateway {
    public void sendPayment(double amountInUSD) {
        System.out.println("Paid $" + amountInUSD + " via PayPal.");
    }
}
