package libraryitems;

public abstract class LibraryItem {

    protected String title;
    protected String itemId;
    protected boolean available;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract String getType();
}
