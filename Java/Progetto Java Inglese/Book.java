public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        String status = available ? "available" : "not available";
        return "[" + title + "] by " + author +
               " (" + publicationYear + ") - " + status;
    }
}
