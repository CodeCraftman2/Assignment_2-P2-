import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "Book Name 1", "Author Name 1", 5);
        Book book2 = new Book(2, "Book Name 2", "Author Name 2", 3);

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        System.out.println(library.isBookPresent("Book Name 1")); // true
        System.out.println(library.isBookPresent("Book Name 3")); // false

        library.removeBook(1);
        library.displayBooks();
    }
}