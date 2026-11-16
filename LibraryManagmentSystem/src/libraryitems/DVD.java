package libraryitems;

public class DVD extends LibraryItem {

    public DVD(String title, String itemId) {
        super(title, itemId);
    }

    @Override
    public String getType() {
        return "DVD";
    }
}
