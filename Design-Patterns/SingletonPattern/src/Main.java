public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Singleton Logger");

        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        if (logger1 == logger2) {
            System.out.println("Same Logger instance is used.");
        } else {
            System.out.println("Different Logger instances!");
        }
    }
}
