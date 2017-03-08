//package myjdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Firstjdbc {
	//private static final String dbClassName = "com.mysql.jdbc.Driver";
	//private static final String CONNECTION = "jdbc:mysql://127.0.0.1/student";
    private static final String url = "jdbc:mysql://localhost/test3"; // select a data base
    private static final String user = "root";
    private static final String password = "Tahmina0";
    
    public static void main(String[] args) throws
                             ClassNotFoundException,SQLException

	{
	//System.out.println(dbClassName);
        try{
            String Query = "Select * from student where rollno = 2";
           Class.forName("com.mysql.jdbc.Driver");
	// Class.forName(dbClassName);
    
        //3rd
        
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Success");
        
        //4th
        Statement st = con.createStatement();
        //5th
        ResultSet rs = st.executeQuery(Query);
        rs.next();
        String sname = rs.getString(2);
            System.out.println(sname);
           // 7th
           con.close();
        }
    
    catch(Exception e) 
    {
        System.err.println(e);
        
    
            }
       }
    
    
}
