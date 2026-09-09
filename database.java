package sql;

import java.sql.*; 
public class database { 
  
    // Main method – program execution starts here 
   public static void main(String[] args) throws Exception{ 
       // Call method to read records from database 
       readRecords(); 
       insertRecord(); 
       insertVar(); 
       insertUsingPst(); 
       update(); 
       commitdemo(); 
   } 
   // Method to retrieve records from the database 
   public static void readRecords() throws Exception { 
   //Class.forName("com.mysql.cj.jdbc.Driver"); 
    // Database connection URL (MySQL database) 
         String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
         // Database username 
         String userName = "root"; 
         // Database password 
         String password = "Nandhini@24"; 
         // SQL query to fetch all records from employee table 
         String query = "select * from employee"; 
         // Establish connection with the database 
         Connection con = DriverManager.getConnection(url, userName, password); 
   //Connection 

   System.out.println("Connected to DataBase Successfully"); 
    
    // Create a Statement object to send SQL query to database 
         Statement st = con.createStatement(); 
         // Execute SQL query and store result in ResultSet 
         ResultSet rs = st.executeQuery(query); 
         // Loop through each row in the ResultSet 
         while (rs.next()) { 
             // Read first column (Employee ID) 
             System.out.println("Id is " + rs.getInt(1)); 
             // Read second column (Employee Name) 
             System.out.println("Name is " + rs.getString(2)); 
             // Read third column (Employee Salary) 
             System.out.println("Salary is " + rs.getInt(3));   
    
  } 
         con.close(); 
  } 
   
   public static void insertRecord() throws Exception { 
       String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
       String userName = "root"; 
       String password = "Nandhini@24"; 
       String query = "insert into employee values (4, 'priya', 250000)"; 
       Connection con = DriverManager.getConnection(url, userName, password); 
       Statement st = con.createStatement(); 
       int rows = st.executeUpdate(query); 
       System.out.println("Number of rows affected: " + rows); 
       st.close(); 
       con.close(); 
   } 
   public static void insertVar() throws Exception { 
       String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
       String userName = "root"; 
       String passWord = "Nandhini@24"; 
       int id = 5; 
       String name = "Varun"; 
       int salary = 300000; 
       // SQL query using variables 
       String query = "insert into employee values (" 
                       + id + ", '" 
                       + name + "', " 
                       + salary + ")"; 
       Connection con = DriverManager.getConnection(url, userName, passWord); 
       Statement st = con.createStatement(); 
       int rows = st.executeUpdate(query); 
       System.out.println("Number of rows affected: " + rows); 
       con.close(); 
   } 
   public static void insertUsingPst() throws Exception { 
       String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
       String userName = "root"; 
       String passWord = "Nandhini@24"; 
       int id = 5; 
       String name = "Varun"; 
       int salary = 300000; 
       // SQL query with placeholders 
       String query = "insert into employee values (?,?,?)"; 
       Connection con = DriverManager.getConnection(url, userName, passWord); 
       PreparedStatement pst = con.prepareStatement(query); 
       pst.setInt(1, id); 
       pst.setString(2, name); 
       pst.setInt(3, salary); 
       int rows = pst.executeUpdate(); 
       System.out.println("Number of rows affected: " + rows); 
       con.close(); 
   } 
   public static void update() throws Exception { 
       String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
       String userName = "root"; 
       String password = "Nandhini@24"; 
       //int id = 5; 
       // SQL UPDATE query 
       String query = "update employee set salary = 150000 where id = 4"; 
       Connection con = DriverManager.getConnection(url, userName, password); 
       Statement st = con.createStatement(); 
       int rows = st.executeUpdate(query); 
       System.out.println("Number of rows affected: " + rows); 
       con.close(); 
   } 
   public static void commitdemo() throws Exception { 
       String url = "jdbc:mysql://localhost:3306/jdbcdemo"; 
       String userName = "root"; 
       String password = "Nandhini@24"; 
       String query1 = "update employee set salary = 400000 where id = 4"; 
       String query2 = "update employee set salary = 400000 where id = 5"; 
       Connection con = DriverManager.getConnection(url, userName, password); 
       // Disable auto-commit 
       con.setAutoCommit(false); 
       Statement st = con.createStatement(); 
       int rows1 = st.executeUpdate(query1); 
       System.out.println("Rows affected: " + rows1); 
       int rows2 = st.executeUpdate(query2); 
       System.out.println("Rows affected: " + rows2); 
       // Commit both updates together 
       con.commit(); 
       con.close(); 
   } 
} 



