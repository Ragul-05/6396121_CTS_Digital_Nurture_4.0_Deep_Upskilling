package Week_1_Design_Principles_and_Patterns_HandsOn.AdapterPatternExample;

public class StripeGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Paid $" + amountInDollars + " via Stripe.");
    }
}