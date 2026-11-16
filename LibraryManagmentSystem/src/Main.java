import factorypattern.*;
import libraryitems.LibraryItem;

public class Main {

    public static void main(String[] args) {

        LibraryItemCreator creator;

        creator = new BookCreator();
        LibraryItem book = creator.createItem(
                "The Odyssey", "G933K");

        creator = new AudiobookCreator();
        LibraryItem audiobook = creator.createItem(
                "Tower of the Swallow", "AB001");

        creator = new DVDCreator();
        LibraryItem dvd = creator.createItem(
                "Man on Fire", "DW2004");

        displayItem(book);
        displayItem(audiobook);
        displayItem(dvd);
    }

    public static void displayItem(LibraryItem item) {
        System.out.println("Type: " + item.getType());
        System.out.println("Title: " + item.getTitle());
        System.out.println("ID: " + item.getItemId());
        System.out.println("Available: " + item.isAvailable());
        System.out.println();
    }
}