package mysql_dv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class lab {
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String USER = "root";
	static final String PASS = "okEK100718?";

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement st = con.createStatement();
		String querry = "SELECT * FROM login";
		st.executeQuery(querry);
		ResultSet rs = st.executeQuery(querry);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Giris Ekranina hosgeldiniz...");
		System.out.print("Lutfen id giriniz: ");
		int kid = scanner.nextInt();
		System.out.print("Lutfen adinizi giriniz: ");
		String kadi = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Lutfen soyadinizi giriniz: ");
		String ksoyadi = scanner.nextLine();
		System.out.print("Lutfen sifrenizi giriniz: ");
		String kpass = scanner.nextLine();
		while(rs.next()) {
		if( rs.getString("adi").equals(kadi)&&rs.getString("soyadi").equals(ksoyadi)&& rs.getString("pass").equals(kpass) ) {
			System.out.println("Giris Basarili");
		}
		else {
			System.out.println("Giris basarisiz");
		}
			
		}

	}

}
