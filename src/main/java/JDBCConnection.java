import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

    private final Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "BlackHead23");

}
