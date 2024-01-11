import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
}

    public Author load(int authorId) throws SQLException {
            Connection connection = jdbcConnection.getConnection();

            String loadAuthor = "SELECT * FROM author WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(loadAuthor);
            preparedStatement.setInt(1, authorId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastname = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                return new Author();
            }
            else
                return null;
        }

    }
//}
