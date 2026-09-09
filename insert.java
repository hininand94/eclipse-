package workbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert {
	 
	public static void insertUsingPst() throws Exception { 
	       String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
	       String userName = "root"; 
	       String passWord = "Test"; 
	       int id = 5; 
	       String name = "Varun"; 
	       int salary = 300000; 
	      
	       String query = "insert into employee values (?,?,?)"; 
	       Connection con = DriverManager.getConnection(url, userName, 
	passWord); 
	       PreparedStatement pst = con.prepareStatement(query); 
	       pst.setInt(1, id); 
	       pst.setString(2, name); 
	       pst.setInt(3, salary); 
	       int rows = pst.executeUpdate(); 
	       System.out.println("Number of rows affected: " + rows); 
	       con.close();
}
}