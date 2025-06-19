package Week_1_Design_Principles_and_Patterns_HandsOn.AdapterPatternExample;

public class PayPalGateway {
    public void sendPayment(double amountInUSD) {
        System.out.println("Paid $" + amountInUSD + " via PayPal.");
    }
}
