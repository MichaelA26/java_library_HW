import java.util.ArrayList;

public class Library {

    private int bookCount;
    private int libraryCapacity;
    private ArrayList<Book> books;

    public Library(int bookCount, int libraryCapacity) {
        this.bookCount = bookCount;
        this.libraryCapacity = libraryCapacity;
        this.books = new ArrayList<Book>();

    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook() {
        Book book = new Book();
        if (libraryCapacity > bookCount()) {
            books.add(book);
        }
    }
}
