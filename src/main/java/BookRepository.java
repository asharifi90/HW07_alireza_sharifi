import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRepository {
    private final JDBCConnection jdbcConnection = new JDBCConnection();

    public BookRepository() throws SQLException {
    }

    public void save(Book book) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addBook = "INSERT INTO book(title, year, author_id) VALUES(?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addBook);


        preparedStatement.setString(1, book.getTitle());
        preparedStatement.setInt(2, book.getYear());
        preparedStatement.setInt(3, book.getAuthorId());

        preparedStatement.executeUpdate();

    }
//    public Book load (int bookId){
//
//    }
    public void delete(Book book){

    }
}
