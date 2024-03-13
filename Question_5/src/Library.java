import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        this.books.put(book.getId(), book);
    }

    public void displayBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public boolean isBookPresent(String name) {
        for (Book book : books.values()) {
            if (book.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(int id) {
        books.remove(id);
    }
}
