package factorypattern;

import libraryitems.Book;
import libraryitems.LibraryItem;

public class BookCreator extends LibraryItemCreator {

    @Override
    public LibraryItem createItem(
            String title, String itemId) {

        return new Book(title, itemId);
    }
}
