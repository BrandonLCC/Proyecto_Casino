// Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 
package controlador;

import BD.ConexionBD;                          
import java.sql.Connection;                         import java.awt.TextField;                 
import java.awt.image.BufferedImage;                import static java.awt.image.ImageObserver.WIDTH;  
import java.io.ByteArrayInputStream;
import java.io.IOException;                         import java.io.InputStream;
import java.sql.SQLException;                       import java.sql.ResultSet;
import java.util.logging.Logger;                    import javax.swing.JTable;
import java.sql.PreparedStatement;                  import java.util.logging.Level;
import javax.imageio.ImageIO;                       import javax.swing.ImageIcon;
import javax.swing.JLabel;                          import javax.swing.JPasswordField;
import modelo.*;                                    import javax.swing.table.DefaultTableModel;
import vista.*;

public class bdMetodos {
    ConexionBD conexion1 = new ConexionBD();
    Connection con = conexion1.EstablecerConexion();
    
//METODO AGREGAR:
public void Agregar(Producto p1) {
    try {
        String SQL_INSERT = "INSERT INTO productosdb.producto(id_categoria, nombre_producto, precio_producto, cantidad_producto, imagen_producto) VALUES(?, ?, ?, ?, ?);";
       
        //Prepara:
        try (PreparedStatement stmta = con.prepareStatement(SQL_INSERT)) {
            if ("Bebida".equals(p1.getCategoriaProducto())){
               stmta.setInt(1, 1); //CATEGORIA BEBIDA = ID 1

            } else if ("Comida".equals(p1.getCategoriaProducto())){
              stmta.setInt(1, 2); //CATEGORIA COMIDA = ID 2

            }

            stmta.setString(2, p1.getNombreProducto());
            stmta.setInt(3, p1.getPrecioProducto());
            stmta.setInt(4, p1.getCantidadProducto());
            stmta.setBytes(5, p1.getImagen());
            stmta.executeUpdate();
            
        }
        System.out.println("¡Se agregó un Producto con éxito!");

    } catch(SQLException ex) {
      System.out.println("Error al ejecutar la la consulta SQL: " + ex.getMessage());

    } catch(Exception e) {
      System.out.println("Error al agregar un producto... : " + e);

    }   
}
 
//SELECT 1 dato
public Producto Seleccionar(int id){
    
   String SQL_SELECT = ("SELECT * FROM productosdb.producto WHERE id_producto = '" + id + "';");
   
   try {
                
    PreparedStatement stm = con.prepareStatement(SQL_SELECT);
    ResultSet set = stm.executeQuery();
    set.next();
            
    int ids       = set.getInt("id_producto");
    String nombs  = set.getString("nombre_producto");
    int precios   = set.getInt("precio_producto");
    int stocks    = set.getInt("cantidad_producto");
    byte [] imags = set.getBytes("imagen_producto");
    
    System.out.println("Selección de datos exitosa");
    
    if(set.getInt("id_categoria") == 1){
        
         Bebidas bebida1 = new Bebidas(ids, "Bebida", nombs, precios, stocks, imags);
         return bebida1;
         
    } else if(set.getInt("id_categoria") == 2) {
    
             Comidas comida1 = new Comidas(ids, "Comida", nombs, precios, stocks, imags);
             return comida1;
             
    }
    
    
    } catch (SQLException e) {
    
        System.out.println("Error al buscar datos "+ e.getMessage());
        
    }
        return null;
}


//UPDATE
public void Modificar_Producto(Producto p){
  
  String SQL_UPDATE = "UPDATE productosdb.producto SET nombre_producto = ?, precio_producto = ?, cantidad_producto = ? WHERE id_producto = ?;";
   
    
   try {
    
      // Establecer los valores de los parámetros
      try (PreparedStatement stm = con.prepareStatement(SQL_UPDATE)) {
          // Establecer los valores de los parámetros
          stm.setString(1, p.getNombreProducto());
          stm.setInt(2, p.getPrecioProducto());
          stm.setInt(3, p.getCantidadProducto());  // Los numeros de mayo a menor indica el orden de las columnas
          stm.setInt(4, p.getIdProducto());  // INGRESA LA ID PARA ACTUALIZAR
          
          System.out.println("Los datos han sido actualizados");
          
          int filasActualizadas = stm.executeUpdate();
          // Imprimir el número de filas actualizadas
          System.out.println("Filas actualizadas: " + filasActualizadas);
          
          stm.execute();
      }
    
    } catch (SQLException e){
        System.out.println("Las filas no se han actualizado corretamente. \nError:" + e.getMessage());
    }

}


//debera verificar si el producto existe
//en un cuadro de dialogo confirmar la eliminacion
//Tener un boton limpiar para cada campo en blanco
//DELETE
public void Eliminar_Producto(int ide){
    String SQL_DELETE = "DELETE FROM productosdb.producto WHERE id_producto = ?;";

    try {
        // Establecer el valor del parámetro
        try (PreparedStatement stm = con.prepareStatement(SQL_DELETE)) {
            // Establecer el valor del parámetro
            stm.setInt(1,  ide); // O el valor correspondiente al id_producto que deseas eliminar
            // Ejecuta
            int filasEliminadas = stm.executeUpdate();
            // Imprimir el resultado
            System.out.println("Filas eliminadas: " + filasEliminadas);
            // Cerrar la conexión y la sentencia
        } // O el valor correspondiente al id_producto que deseas eliminar

        System.out.println("¡Fila eliminada correctamente!");

    } catch (SQLException e) {
        System.out.println("Error al eliminar. Error: " + e.getMessage());
    }
  
}


//Mostrar datos completos de los productos (LISTO)
//Incorpora un filtro de busqueda segun el tipo categoria producto. (LISTO)
   
//METODO LISTAR:
//METODO LISTAR:
public void Listar_Producto(JTable TABLA_){
    try {
        String SQL_SELECT = " SELECT p.id_producto, ca.id_categoria,                                \n" +
               "               ca.nombre_categoria, p.nombre_producto,                        \n" +
               "               p.precio_producto,   p.cantidad_producto, p.imagen_producto    \n" +
           
               " FROM productosdb.producto p INNER JOIN  productosdb.categoria_producto ca    \n" +
               " ON p.id_categoria = ca.id_categoria;";
        PreparedStatement stm = con.prepareStatement(SQL_SELECT); //Ejecutamos la instruccion
        
        DefaultTableModel model = new DefaultTableModel();
 
        model.addColumn("id_producto");
        model.addColumn("id_categoria");
        model.addColumn("categoria_producto");
        model.addColumn("nombre_producto");
        model.addColumn("precio_producto");
        model.addColumn("cantidad_producto");
        model.addColumn("imagen_producto");
        
        ResultSet set = stm.executeQuery();

    try {  
        while(set.next()) {
            Object [] fila = new Object[7]; //Esto es un arreglo   

            //get: objeter los datos 
            fila[0] = set.getObject(1);
            fila[1] = set.getObject(2);
            fila[2] = set.getObject(3);
            fila[3] = set.getObject(4);
            fila[4] = set.getObject(5);
            fila[5] = set.getObject(6);
            try{
                    
                    byte [] img = set.getBytes(7);
                    InputStream inpS =new ByteArrayInputStream(img);
                    BufferedImage buffI = ImageIO.read(inpS);
                    ImageIcon mIcon = new ImageIcon(buffI.getScaledInstance(60, 60, 0));
                    fila[6] = (mIcon);
                    TABLA_.setDefaultRenderer(Object.class, new ImageIconRender());


                } catch (IOException | SQLException e) {
                
                    
                    fila[6] = new JLabel("No imagen");
                }     
            //Blob blob = (Blob) set.getBlob(7);
            
            //byte[] data = blob.getBytes(1,(int)blob.length());
            //BufferedImage img = null;

            try {
            //img = ImageIO.read(new ByteArrayInputStream(data));//para correr

            }catch(Exception e){
                System.out.println("error"+ e);
            }

           // ImageIcon icono = new ImageIcon(img);//Imagen leia
           // fila[1] = new JLabel(icono); //directamente no agregaremos a la tabla sino crearemos un jabel

            model.addRow(fila);
           
        }
        
        TABLA_.setModel(model);
    TABLA_.setRowHeight(64);
     
    System.out.println("Ejecucion terminada.");
    } catch(SQLException ex){
            System.out.println("Error al ejecutar la consulta SQL: " + ex.getMessage());
            
    }
    } catch (Exception e) {
      System.out.println("Error al listar datos... :" + e.getMessage());
      
    }
}

public void Listar_Categoria(TextField ID_CATEGORIA, JTable TABLA_){

   String SQL_INNER = " SELECT p.id_producto, ca.id_categoria,                                \n" +
               "               ca.nombre_categoria, p.nombre_producto,                        \n" +
               "               p.precio_producto,   p.cantidad_producto, p.imagen_producto    \n" +
           
               " FROM productosdb.producto p INNER JOIN  productosdb.categoria_producto ca    \n" +
               " ON p.id_categoria = ca.id_categoria    \n" +
               " WHERE ca.nombre_categoria = ?;";
    
    try{
        PreparedStatement stm = con.prepareStatement(SQL_INNER);
        stm.setString(1,  ID_CATEGORIA.getText());
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_producto");
        model.addColumn("id_categoria");
        model.addColumn("nombre_categoria");
        model.addColumn("nombre_producto");
        model.addColumn("precio_producto");
        model.addColumn("cantidad_producto");
        model.addColumn("imagen_producto");
        ResultSet set = stm.executeQuery();
        
    try{
         
    while(set.next()){
        Object [] fila = new Object[7];
        fila[0] = set.getObject(1);
        fila[1] = set.getObject(2);
        fila[2] = set.getObject(3);
        fila[3] = set.getObject(4);
        fila[4] = set.getObject(5);
        fila[5] = set.getObject(6);
        try{

        byte [] img = set.getBytes(7);
        InputStream inpS =new ByteArrayInputStream(img);
        BufferedImage buffI = ImageIO.read(inpS);
        ImageIcon mIcon = new ImageIcon(buffI.getScaledInstance(60, 60, 0));
        fila[6] = (mIcon);
        TABLA_.setDefaultRenderer(Object.class, new ImageIconRender());


    } catch (IOException | SQLException e) {
        fila[6] = new JLabel("No imagen");
        
    }     

        model.addRow(fila);
       
        TABLA_.setModel(model);
        TABLA_.setRowHeight(64);   
      
    }    
    } catch(Exception e){
        System.out.println("Error al listar datos Por categoria... :" + e);
    }
    
    } catch(SQLException ex){
        System.out.println("Error con la consulta SQL... : " + ex);
    }
}

public void InicioSession(TextField CAJA_NOMBRE_ADMIN, 
                          JPasswordField CAJA_CONTRASEÑA_ADMIN_USUARIO){
    
    try {
        
        String SQL_ADMIN = "select * from productosdb.usuario where nombre_usuario = ? AND contraseña_usuario = ?;";
        
        PreparedStatement stm = con.prepareStatement(SQL_ADMIN);
        
        try {
            
            stm.setString(1, CAJA_NOMBRE_ADMIN.getText());
            stm.setString(2, CAJA_CONTRASEÑA_ADMIN_USUARIO.getText());
            
            ResultSet resultSet = stm.executeQuery();

        if (resultSet.next()) {
            System.out.println("DATOS INGRESADOS DE FORMA EXITOSA");
             Menu menu = new Menu();
             MostrarPanel(menu);

              
        } else {
            System.out.println("ERROR AL INICIAR SESIÓN");
            
               }
        }
        catch(SQLException e){
            System.out.println("error al ejecutar BASE DE DATOS:"+ e.getMessage());
        }
    }
    catch(SQLException ex){
            Logger.getLogger(bdMetodos.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

    private void MostrarPanel(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
