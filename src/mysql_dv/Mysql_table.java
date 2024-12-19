package mysql_dv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql_table {
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String USER = "root";
	static final String PASS = "okEK100718?";
	
	public static void main(String [] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st = con.createStatement();
		String sql = "insert into login values (102, 'Ahmet' , 'Mehmet', 'pass12345')";
		st.executeUpdate(sql);
		String sql1 = "insert into login values (101, 'Ayse' , 'Fatma', 'sifre12345')";
		st.executeUpdate(sql1);
		System.out.println("Database tablo olusturuldu...");
	}
}
