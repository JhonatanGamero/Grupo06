
package BD;

import java.sql.*;

public class BdConnection {
    
    static String url="jdbc:mysql://127.0.0.1:3306/Nexus";
    static String user="root";
    static String pass="23092005";
    
    public static Connection conectar()
    {
       Connection con=null;
       try
       {
       con=DriverManager.getConnection(url,user,pass);
           System.out.println("Conexión exitosa");
       }catch(SQLException e)
       {
        e.printStackTrace();
       }
       
       return con;
               
    }
}
