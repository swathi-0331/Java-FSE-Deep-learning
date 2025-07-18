package ecommercePlatformSearchFunction;
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Phone", "Electronics"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        int searchId = 103;

        // Linear Search
        Product linearResult = SearchAlgorithms.linearSearch(products, searchId);
        System.out.println("🔍 Linear Search Result:");
        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product not found.");
        }

        // Binary Search
        Product binaryResult = SearchAlgorithms.binarySearch(products, searchId);
        System.out.println("\n🔍 Binary Search Result:");
        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product not found.");
        }

        // Analysis
        System.out.println("\n📊 Time Complexity Analysis:");
        System.out.println("Linear Search: O(n) - Checks each element one by one.");
        System.out.println("Binary Search: O(log n) - Divides search space in half each step (requires sorted data).");

        System.out.println("\n✅ Binary search is more efficient for large, sorted datasets.");
    }
}
