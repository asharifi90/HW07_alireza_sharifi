import java.sql.SQLException;

public class BookService {

    public void addBook(String title, int year, int authorId) throws SQLException {
        Book book = new Book(title, year, authorId);
        BookRepository bookRepository = new BookRepository();
        bookRepository.save(book);
    }
}
