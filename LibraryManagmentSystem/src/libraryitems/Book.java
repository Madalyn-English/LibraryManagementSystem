package libraryitems;

// Represents a book in the library catalog.
public class Book extends LibraryItem {

    public Book(String title, String itemId) {
        super(title, itemId);
    }

    @Override
    public String getType() {
        return "Book";
    }
}