
package jdbcdemo;

import java.sql.*;
//import java.util.Scanner;
public class Jdbcdemo {

   
    public static void main(String[] args) throws Exception
    {
       
//    Class.forName("com.mysql.jdbc.Driver");
    
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
    
       
      
        
       String s="insert into student values(120,'PPP')";
       Statement st=con.createStatement();
  
     
int i=st.executeUpdate(s);
// int i= ps.executeUpdate();
     if (i>0)
     {
     
            System.out.println("value inserted..");
     
     }
     else{
         System.out.println("value is not inserted...");
     }
     
        
}
}