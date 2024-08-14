package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExampleOtherWay{
	
	public static void main(String[] args) throws SQLException
	{
	Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/demo","root","Nte#25");
	Statement stmt = conn.createStatement();
	String s = "select book_no,title,sub_code,author from book_detl";
	ResultSet rs = stmt.executeQuery(s);
	
	while(rs.next())
	{
		System.out.print(" B_no: "+ rs.getString("book_no"));
		System.out.print(" title: "+ rs.getString("title"));
		System.out.print(" sub_code: "+ rs.getString("sub_code"));
		System.out.print(" author: "+ rs.getString("author"));
		System.out.println(" ");
	}
	conn.close();
	
}
}
