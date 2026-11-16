package factorypattern;

import libraryitems.LibraryItem;

public abstract class LibraryItemCreator {

    public abstract LibraryItem createItem(
            String title, String itemId);
}
