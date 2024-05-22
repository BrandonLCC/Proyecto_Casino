package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author jonah
 */
public class ConexionBD {
        
    public Connection EstablecerConexion() {
        
        Connection conexion = null;

        String url = "jdbc:mysql://localhost:3306/productosdb";
        String usuario = "root";
        String contraseña = "brandon2033";
      
        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            if (conexion != null) {
              
            JOptionPane.showMessageDialog(null, "CONECTADO A LA BASE DE DATOS ");
            }

        } catch (SQLException e) {
            //Mostrar un mensaje tipo jpanel que nos muestre si la conexion ha sido de forma exitosa o no.
            JOptionPane.showMessageDialog(null, "NO HAY CONEXION A LA BASE DE DATOS \nERROR: " + e.toString());

        }
        return conexion;
    }
}
