public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Il nome della rosa", "Umberto Eco", 1980);
        Book b2 = new Book("1984", "George Orwell", 1949);
        Book b3 = new Book("Il piccolo principe", "Antoine de Saint-Exupéry", 1943);

        DigitalBook db1 = new DigitalBook("Clean Code", "Robert C. Martin", 2008, "PDF", 4.5);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(db1);

        System.out.println("\n Complete list");
        library.showAll();

        System.out.println("\n Search by title: '1984'");
        library.searchByTitle("1984");

        System.out.println("\n Search by author: 'George Orwell'");
        library.searchByAuthor("George Orwell");

        System.out.println("\n Search by title: 'Non-existent book'");
        library.searchByTitle("Non-existent book");

        System.out.println("\n Removing '1984'");
        try {
            library.removeBook("1984");
        } catch (BookNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n List after removal");
        library.showAll();

        
        System.out.println("\n Attempt to remove a non-existent book");
        try {
            library.removeBook("Ghost book");
        } catch (BookNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\n Number of books in the library: " + library.getBookCount());
    }
}
