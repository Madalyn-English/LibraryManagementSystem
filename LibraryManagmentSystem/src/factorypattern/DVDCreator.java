package factorypattern;

import libraryitems.DVD;
import libraryitems.LibraryItem;

public class DVDCreator extends LibraryItemCreator {

    @Override
    public LibraryItem createItem(
            String title, String itemId) {

        return new DVD(title, itemId);
    }
}
