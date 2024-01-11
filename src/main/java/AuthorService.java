import java.sql.SQLException;

public class AuthorService {

    public void register(String firstname, String lastname, int age) throws SQLException {
        Author author = new Author(firstname, lastname, age);
        AuthorRepository authorRepository = new AuthorRepository();
        authorRepository.save(author);
    }
}
