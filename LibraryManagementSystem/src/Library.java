import java.util.Arrays;
import java.util.Comparator;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // Linear search by title
    public Book linearSearch(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (assuming sorted)
    public Book binarySearch(String title) {
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0)
                return books[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}
