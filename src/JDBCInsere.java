import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import java.sql.PreparedStatement;

public class JDBCInsere {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {

			con = new ConnectionFactory().getConnection();

			String sql = "insert into contatos"
					+ " (nome, email, endereco, dataNascimento)"
					+ " values (?,?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);

			Date data = new java.sql.Date(Calendar.getInstance()
					.getTimeInMillis());

			stmt.setString(1, "Caelum");
			stmt.setString(2, "contato@caelum.com.br");
			stmt.setString(3, "Rua Vergueiro");
			stmt.setDate(4, data);

			stmt.execute();
			stmt.close();

			System.out.println("gravado!");
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			con.close();
		}
	}

}
