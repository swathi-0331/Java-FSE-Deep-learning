public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(201, "Alice", 320.50),
            new Order(202, "Bob", 150.00),
            new Order(203, "Charlie", 800.00),
            new Order(204, "David", 450.75),
            new Order(205, "Eva", 200.00)
        };

        // Clone orders array for both algorithms
        Order[] bubbleSortedOrders = orders.clone();
        Order[] quickSortedOrders = orders.clone();

        System.out.println("Bubble Sort (by Total Price):");
        SortAlgorithms.bubbleSort(bubbleSortedOrders);
        SortAlgorithms.printOrders(bubbleSortedOrders);

        System.out.println("\nQuick Sort (by Total Price):");
        SortAlgorithms.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        SortAlgorithms.printOrders(quickSortedOrders);

        System.out.println("\nTime Complexity Analysis:");
        System.out.println("Bubble Sort: O(n^2) - Slow on large datasets.");
        System.out.println("Quick Sort: O(n log n) average - Fast and efficient.");
        System.out.println("Quick Sort is generally preferred for better performance.");
    }
}
