package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExample {

		static final String DB_URL = "jdbc:mysql://127.0.01:3306/demo";
		static final String USER = "root";
		static final String PASS ="Nte#25";
		static final String Query = "select book_no,title,sub_code,author from book_detl";
		
		public static void main(String[] args)
		{
			try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(Query);)
			{
				while(rs.next())
				{
					System.out.print(" B_no: "+ rs.getString("book_no"));
					System.out.print(" title: "+ rs.getString("title"));
					System.out.print(" sub_code: "+ rs.getString("sub_code"));
					System.out.print(" author: "+ rs.getString("author"));
					System.out.println(" ");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
}
