package jdbc_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class A {

	public static void main(String[] args) {
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student11", "root", "reddy");
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery("select * from student11");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
