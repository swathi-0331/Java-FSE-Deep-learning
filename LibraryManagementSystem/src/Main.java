public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "The Alchemist", "Paulo Coelho"),
            new Book(102, "To Kill a Mockingbird", "Harper Lee"),
            new Book(103, "1984", "George Orwell"),
            new Book(104, "Pride and Prejudice", "Jane Austen"),
            new Book(105, "The Great Gatsby", "F. Scott Fitzgerald")
        };

        Library library = new Library(books);

        // Linear Search
        System.out.println("Linear Search: Searching for '1984'");
        Book result1 = library.linearSearch("1984");
        if (result1 != null)
            System.out.println("Found: " + result1.title + " by " + result1.author);
        else
            System.out.println("Book not found.");

        // Binary Search
        System.out.println("\nBinary Search: Searching for 'Pride and Prejudice'");
        Book result2 = library.binarySearch("Pride and Prejudice");
        if (result2 != null)
            System.out.println("Found: " + result2.title + " by " + result2.author);
        else
            System.out.println("Book not found.");
    }
}
