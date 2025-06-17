package Design_Principles_and_Patterns.AdapterPatternExample;

public class StripeGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Paid $" + amountInDollars + " via Stripe.");
    }
}