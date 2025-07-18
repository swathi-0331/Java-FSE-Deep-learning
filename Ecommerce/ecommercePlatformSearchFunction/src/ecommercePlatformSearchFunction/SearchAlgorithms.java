import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    // Linear Search by productId
    public static Product linearSearch(Product[] products, int keyId) {
        for (Product product : products) {
            if (product.productId == keyId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search by productId
    public static Product binarySearch(Product[] products, int keyId) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));  // Ensure it's sorted
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == keyId) {
                return products[mid];
            } else if (products[mid].productId < keyId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}

