import java.sql.SQLException;

public class AuthorRepository {

    private final JDBCConnection jdbcConnection = new JDBCConnection();

    public AuthorRepository() throws SQLException {
    }

    public void save(Author author){

    }

    public Author load(int authorId){

    }
}
