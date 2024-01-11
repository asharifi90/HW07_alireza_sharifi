import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, SQLException {
        BookService bookService = new BookService();
        bookService.addBook("How to", 98, 1);

        AuthorService authorService = new AuthorService();
        authorService.register("ali","sh",33);
    }
}
