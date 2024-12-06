
package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class BdConnection {
    Connection conectar = null;
    String usuario= "root";
    String contrasena= "23092005";
    String bd = "Nexus";
    String ip = "localhost";
    String puerto = "3306";

    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;

    public Connection estableceConexion(){
        try{
             JOptionPane.showMessageDialog (null, "Se conectó correctamente a la base de datos.");
       
        }catch (Exception e){
        JOptionPane.showMessageDialog (null, "No se conectó a la base de datos, error: "+e.toString());
        }
        return conectar;
    }
}
