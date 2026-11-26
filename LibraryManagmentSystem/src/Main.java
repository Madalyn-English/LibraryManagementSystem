import factorypattern.*;
import libraryitems.LibraryItem;
import library.LibraryArchive;

public class Main {

    public static void main(String[] args) {

        // Creates the library archive.
        LibraryArchive archive = new LibraryArchive();

        // Declares a creator for different library item types.
        LibraryItemCreator creator;

        // Creates a book.
        creator = new BookCreator();
        LibraryItem book = creator.createItem(
                "The Odyssey", "G933K");

        // Creates an audiobook.
        creator = new AudiobookCreator();
        LibraryItem audiobook = creator.createItem(
                "Tower of the Swallow", "AB001");

        // Creates a DVD.
        creator = new DVDCreator();
        LibraryItem dvd = creator.createItem(
                "Man on Fire", "DW2004");

        // Adds the created items to the archive.
        archive.addItem(book);
        archive.addItem(audiobook);
        archive.addItem(dvd);

        // Displays all items in the archive.
        System.out.println("===== Library Archive =====");
        archive.displayItems();

        // Searches for an item using its ID.
        System.out.println("\n===== Item Search =====");
        LibraryItem foundItem = archive.findItem("G933K");

        if (foundItem != null) {
            displayItem(foundItem);
        } else {
            System.out.println("Item not found.");
        }
    }

    // Displays the details of an individual library item.
    public static void displayItem(LibraryItem item) {
        System.out.println("Type: " + item.getType());
        System.out.println("Title: " + item.getTitle());
        System.out.println("ID: " + item.getItemId());
        System.out.println("Available: " + item.isAvailable());
        System.out.println();
    }
}