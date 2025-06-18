package Design_Principles_and_Patterns.ObserverPatternExample;

public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Web App " + user + " - Stock Alert: " + stockName + " is ₹" + stockPrice);
    }
}