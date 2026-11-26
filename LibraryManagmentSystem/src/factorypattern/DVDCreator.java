package factorypattern;

import libraryitems.DVD;
import libraryitems.LibraryItem;

//responsible for creating DVD objects.
public class DVDCreator extends LibraryItemCreator {

    @Override
    public LibraryItem createItem(
            String title, String itemId) {

        return new DVD(title, itemId);
    }
}
