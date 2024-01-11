import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorRepository {

    private final JDBCConnection jdbcConnection = new JDBCConnection();

    public AuthorRepository() throws SQLException {
    }

    public void save(Author author) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addAuthor = "INSERT INTO author(first_name, last_name, age) VALUES(?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addAuthor);


        preparedStatement.setString(1, author.getFirstName());
        preparedStatement.setString(2, author.getLastName());
        preparedStatement.setInt(3, author.getAge());

        preparedStatement.executeUpdate();
    }

    public Author load(int authorId){

    }
}
