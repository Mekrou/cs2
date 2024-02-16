abstract class Item {
    private String title;

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Item() {
        this.title = "";
    }

    public Item(String title) {
        this.title = title;
    }

    protected abstract String getListing();

    public String toString() {
        return this.title;
    }
}