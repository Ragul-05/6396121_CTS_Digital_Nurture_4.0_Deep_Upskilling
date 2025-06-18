package Design_Principles_and_Patterns.ObserverPatternExample;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Mobile App " + name + " - Stock Update: " + stockName + " is now ₹" + stockPrice);
    }
}