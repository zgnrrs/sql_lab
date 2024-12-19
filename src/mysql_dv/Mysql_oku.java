package mysql_dv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql_oku {

	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String USER = "root";
	static final String PASS = "okEK100718?";
	
	public static void main(String [] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st = con.createStatement();
		String querry = "SELECT * FROM login where soyadi like '%me%'";
		st.executeQuery(querry);
		ResultSet rs = st.executeQuery(querry);
		while(rs.next()) {
			System.out.println("ID: " + rs.getInt("id"));
			System.out.println("ADI: " + rs.getString("adi"));
			System.out.println("SOYADI: " + rs.getString("soyadi"));
			System.out.println("PASS:  " + rs.getString("pass"));
		}


	}

}
