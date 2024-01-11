import java.sql.SQLException;

public class BookService {

    public void addBook(String title, int year, int authorId) throws SQLException {
        Book book = new Book("how to", 1998, 1);
        BookRepository bookRepository = new BookRepository();
        bookRepository.save(book);
    }
}
