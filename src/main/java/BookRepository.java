import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public Book load(int bookId) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String loadAuthor = "SELECT * FROM author WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(loadAuthor);
        preparedStatement.setInt(1, bookId);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            String title = resultSet.getString("title");
            int year = resultSet.getInt("year");
            String author = resultSet.getString("writer");
            Book book = new Book(title, year, author);
            return book;
        } else {
            return null;
        }
    }

    public void delete(Book book){

    }
}
