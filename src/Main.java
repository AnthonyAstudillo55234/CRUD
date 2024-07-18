import com.mysql.cj.jdbc.ConnectionGroup;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/clase";
        String user="root";
        String password="123456";
        Connection con= null;
        PreparedStatement ps = null;
        try{
            con = DriverManager.getConnection(url,user,password);
            String sql = "update estudiantes set b1 = ? where cedula = ?";
            ps = con.prepareStatement(sql);
            ps.setFloat(1, 18.24F);
            ps.setString(2,"3342166849");
            System.out.println(sql);
            int a = ps.executeUpdate();
            System.out.println("Se modificaron: "+a+" Lineas");
            System.out.println("Se han ingresado los datos del estudiante");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}