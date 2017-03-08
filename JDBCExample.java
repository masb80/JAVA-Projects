//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample{
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   //static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
    static final String DB_URL = "jdbc:mysql://localhost/PAYROLLS";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "Tahmina0";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

/*

//STEP 4: Execute a query
// collecting data in ascending and descending order
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      // Extract records in ascending order by first name.
      System.out.println("Fetching records in ascending order...");
      String sql = "SELECT id, first, last, age FROM REGISTRATION" +
                   " ORDER BY first ASC";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }

      // Extract records in descending order by first name.
      System.out.println("Fetching records in descending order...");
      sql = "SELECT id, first, last, age FROM REGISTRATION" +
                   " ORDER BY first DESC";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      rs.close();


*/

/*
  //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      // Extract records without any condition.
      System.out.println("Fetching records without condition...");
      String sql = "SELECT id, first, last, age FROM REGISTRATION";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }

      // Select all records having ID equal or greater than 101
      System.out.println("Fetching records with condition... WHERE id >= 101 ");
      sql = "SELECT id, first, last, age FROM REGISTRATION" +
                   " WHERE id >= 101 ";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }

	// Select all records having ID equal or greater than 101
      System.out.println("Fetching records with condition... WHERE first LIKE '%za%'");
      sql = "SELECT id, first, last, age FROM REGISTRATION" +
                   " WHERE first LIKE '%za%' ";
      rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      rs.close();

      */

/*

 //STEP 4: Execute a query
 // Update the table database STUDENTS/REGISTRATION
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "UPDATE REGISTRATION " +
                   "SET age = 30 WHERE id in (100, 101)";

// FOR DELETE THE DATA FROM REGISTRATION TABLE
// String sql = "DELETE FROM Registration " + "WHERE id = 101";
      stmt.executeUpdate(sql);

      // Now you can extract all the records
      // to see the updated records
      sql = "SELECT id, first, last, age FROM REGISTRATION";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      rs.close();

*/


/*
 //STEP 4: Execute a query
 // Reading or collecting data from database/table
      System.out.println("Creating statement...");
      stmt = conn.createStatement();

      String sql = "SELECT id, first, last, age FROM REGISTRATION";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
      }
      rs.close();


*/

 //STEP 4: Execute a query
// insert a records in a table
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO employee " +
                   "VALUES (100, 'Zara Ali', 'Toronto', 18000, 'female')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES (101, 'Mahnaz Fatma', 'Ottawa', 25000,'male')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES (102, 'Zaid Khan', 'Vancuiber', 30000, 'male')";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO employee " +
                   "VALUES(103, 'Sumit Mittal', 'Halifax', 28000, 'male')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");




/*
// create a table in database

  //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE employee " +
                   "(id INTEGER not NULL, " +
                   " name VARCHAR(255), " + 
                   " city VARCHAR(255), " + 
                   " sal INTEGER, " + 
		    " sex VARCHAR(255), " +
                   " PRIMARY KEY ( id ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");


*/
/*
 // create a database
      //STEP 4: Execute a query
      System.out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE PAYROLLS";
      stmt.executeUpdate(sql);
      System.out.println("Database created successfully...");
*/

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye! I have successfully run the JDBC");
}//end main
}//end JDBCExample
