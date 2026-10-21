import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String title) throws BookNotFoundException {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                books.remove(b);
                System.out.println("Book removed: " + title);
                return; 
            }
        }
    
        throw new BookNotFoundException("Book not found: " + title);
    }


    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("  " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found for author: " + author);
        }
    }

    
    public void searchByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("  " + b);
                return;
            }
        }
        System.out.println("No book found with title: " + title);
    }

    
    public void showAll() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("Book list (" + books.size() + " total)");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    
    public int getBookCount() {
        return books.size();
    }
}
