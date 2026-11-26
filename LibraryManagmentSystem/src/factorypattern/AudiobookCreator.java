package factorypattern;

import libraryitems.Audiobook;
import libraryitems.LibraryItem;

//responsible for creating Audiobook objects.
public class AudiobookCreator extends LibraryItemCreator {

    @Override
    public LibraryItem createItem(
            String title, String itemId) {

        return new Audiobook(title, itemId);
    }
}
