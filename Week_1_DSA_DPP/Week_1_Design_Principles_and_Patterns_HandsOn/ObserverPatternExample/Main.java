package Week_1_Design_Principles_and_Patterns_HandsOn.ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile1 = new MobileApp("Ragul");
        Observer web1 = new WebApp("Investor_01");

        market.registerObserver(mobile1);
        market.registerObserver(web1);

        market.setStockPrice("TCS", 3645.00);
        System.out.println();

        market.setStockPrice("Infosys", 1499.50);
        System.out.println();

        market.removeObserver(web1);
        market.setStockPrice("HDFC Bank", 1620.10);
    }
}