public class Book extends Item {
    private long isbn_number;
    private String author;

    public long getIsbn() {
        return this.isbn_number;
    }

    public void setIsbn(long isbn) {
        this.isbn_number = isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() { }

    public Book(String title, long isbn_number, String author) {
        super(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }

    protected String getListing() {
        return 
        "Book Name - " + getTitle() + 
        "\nAuthor - " + getAuthor() + 
        "\nISBN # - " + getIsbn();
    }
}
