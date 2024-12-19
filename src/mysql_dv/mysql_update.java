package mysql_dv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql_update {
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String USER = "root";
	static final String PASS = "okEK100718?";
	
	public static void main(String [] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st = con.createStatement();
		String sql = "update login set adi = 'Hasan' where id in (100)";
		st.executeUpdate(sql);
		
	}
}
