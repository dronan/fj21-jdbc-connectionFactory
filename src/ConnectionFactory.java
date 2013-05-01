import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21",
					"root", "");
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}

	}
}
