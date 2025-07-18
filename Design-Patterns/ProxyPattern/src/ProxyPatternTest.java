
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("nature1.jpg");
        Image img2 = new ProxyImage("nature2.jpg");

        // Image loaded from disk on first access
        img1.display();

        // Second access, uses cached image
        img1.display();

        // First access for second image
        img2.display();

        // Cached access
        img2.display();
    }
}
