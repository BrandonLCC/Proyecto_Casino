package casinoduoc;

import BD.ConexionBD;
import javax.swing.JFrame;
import vista.InicioSesion;

/**
 *
 * @author jonah
 */
public class CasinoDuoc {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
    ConexionBD conexion = new ConexionBD();
    conexion.EstablecerConexion();
    
     InicioSesion miPanel = new InicioSesion();
        
    // Muestra el JPanel en un nuevo JFrame
    JFrame frame = new JFrame("Casino Duoc UC");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().add(miPanel);
    frame.pack();
    frame.setVisible(true);
   
}
}