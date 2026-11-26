package library;

import libraryitems.LibraryItem;
import java.util.ArrayList;
import java.util.List;

// Manages the items stored in the library catalog.
public class LibraryArchive {

    // Stores all library materials.
    private final List<LibraryItem> items = new ArrayList<>();

    // Adds an item to the library catalog.
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Displays the type, title, and ID of each item.
    public void displayItems() {
        for (LibraryItem item : items) {
            System.out.println(
                    item.getType() + ": " +
                            item.getTitle() + " (" +
                            item.getItemId() + ")"
            );
        }
    }

    // Searches for a library item by its ID.
    public LibraryItem findItem(String itemId) {
        for (LibraryItem item : items) {
            if (item.getItemId().equals(itemId)) {
                return item;
            }
        }

        // Returns null if the item is not found.
        return null;
    }
}