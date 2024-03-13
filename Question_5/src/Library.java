import java.util.HashMap;

public class Library {
    HashMap<Integer, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.id, book);
    }

    public boolean isBookPresent(String name) {
        return books.values().stream().anyMatch(book -> book.name.equals(name));
    }

    public void removeBook(int id) {
        books.remove(id);
    }

    public void displayBooks() {
        books.values().forEach(System.out::println);
    }
}
