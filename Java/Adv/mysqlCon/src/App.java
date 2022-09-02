
import java.sql.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "1234");
        if (con != null) {
            System.out.println("Connection Estab.");
        }
        else
            System.out.println("Connection not establi");

        Statement st = con.createStatement();

        String s = "select Roll,Name from student";
        ResultSet rs = st.executeQuery(s);
        while (rs.next()) {
            System.out.println(rs.getString("Roll") + "  " + rs.getString("Name"));
        }

    }

}
