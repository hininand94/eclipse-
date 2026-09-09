package sql;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class Insert {
 
    public static void main(String[] args) throws Exception {
        insertRecord();
    }
 
    public static void insertRecord() throws Exception {
 
        String url = "jdbc:mysql://localhost:3306/student_db";
        String userName = "root";
        String password = "Nandhini@24";
 
        String query = "INSERT INTO student (id, name, salary) VALUES (4, 'Priya', 250000)";
 
        Class.forName("com.mysql.cj.jdbc.Driver");
 
        Connection con = DriverManager.getConnection(url, userName, password);
 
        Statement st = con.createStatement();
 
        int rows = st.executeUpdate(query);
 
        System.out.println("Number of rows affected: " + rows);
 
        st.close();
        con.close();
    }
}
	

	   
	                           

