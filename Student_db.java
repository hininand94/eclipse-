package sql;

import java.sql.*;
 
public class Student_db {

	public static void main(String[] args)throws Exception{
	
		 String url = "jdbc:mysql://localhost:3306/Student_db";    
		   
		 String userName = "root";
		  
		 String password = "Nandhini@24";  
		   
		 Connection con = DriverManager.getConnection(url, userName, password);
	         
		 System.out.println("Connected to DataBase Successfully"); 
		 con.close();} 
		 
		 
	}


