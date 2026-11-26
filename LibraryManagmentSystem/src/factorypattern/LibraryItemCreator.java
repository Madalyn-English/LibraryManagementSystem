package factorypattern;

import libraryitems.LibraryItem;

// Abstract creator for the Factory Method design pattern
//allows new library item types to be added through subclasses
public abstract class LibraryItemCreator {

    // Subclasses determine which type of library item to create
    public abstract LibraryItem createItem(
            String title, String itemId);
}
