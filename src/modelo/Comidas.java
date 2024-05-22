/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jonah
 */
public class Comidas extends Producto{

    public Comidas() {
    }

    public Comidas(String CategoriaProducto, String nombreProducto, int PrecioProducto, int CantidadProducto, byte [] imagen) {
        super(CategoriaProducto, nombreProducto, PrecioProducto, CantidadProducto, imagen);
    }
    
    

    public Comidas(int idProducto, String CategoriaProducto, String nombreProducto, int PrecioProducto, int CantidadProducto, byte [] imagen) {
        super(idProducto, CategoriaProducto, nombreProducto, PrecioProducto, CantidadProducto, imagen);
    } 
    
}

