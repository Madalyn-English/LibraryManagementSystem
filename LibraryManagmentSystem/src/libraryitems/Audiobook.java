package libraryitems;

// Represents an Audiobook in the library catalog.
public class Audiobook extends LibraryItem {

    public Audiobook(String title, String itemId) {
        super(title, itemId);
    }

    @Override
    public String getType() {
        return "Audiobook";
    }
}