public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer user1 = new MobileApp("Alice");
        Observer user2 = new WebApp("Bob");

        stockMarket.registerObserver(user1);
        stockMarket.registerObserver(user2);

        stockMarket.setStockPrice("AAPL", 175.60);
        stockMarket.setStockPrice("GOOGL", 2835.30);

        stockMarket.removeObserver(user2);

        stockMarket.setStockPrice("TSLA", 925.10);
    }
}
