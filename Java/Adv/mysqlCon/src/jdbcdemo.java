
import java.sql.*;

//import java.util.Scanner;
public class jdbcdemo {

    public static void main(String[] args) throws Exception {

        // Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "1234");

        String s = "insert into student values(120,'PPP',12,50,'Dubai',247845,'UAE')";
        Statement st = con.createStatement();

        int i = st.executeUpdate(s);
        // int i= ps.executeUpdate();
        if (i > 0) {

            System.out.println("value inserted..");

        } else {
            System.out.println("value is not inserted...");
        }

    }
}