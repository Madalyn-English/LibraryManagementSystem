package factorypattern;

import libraryitems.Audiobook;
import libraryitems.LibraryItem;

public class AudiobookCreator extends LibraryItemCreator {

    @Override
    public LibraryItem createItem(
            String title, String itemId) {

        return new Audiobook(title, itemId);
    }
}
