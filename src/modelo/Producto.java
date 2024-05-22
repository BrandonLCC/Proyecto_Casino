/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author jonah
 */
public abstract class Producto {
    
    private int idProducto;
    private String CategoriaProducto;
    private String nombreProducto;
    private int PrecioProducto;
    private int CantidadProducto;
    private byte []  imagen;

    public Producto(String CategoriaProducto, String nombreProducto, int PrecioProducto, int CantidadProducto, byte [] imagen) {
        this.CategoriaProducto = CategoriaProducto;
        this.nombreProducto = nombreProducto;
        this.PrecioProducto = PrecioProducto;
        this.CantidadProducto = CantidadProducto;
        this.imagen = imagen;
    }
    
    
    public Producto(int idProducto, String CategoriaProducto, String nombreProducto, int PrecioProducto, int CantidadProducto, byte []  imagen) {
        this.idProducto = idProducto;
        this.CategoriaProducto = CategoriaProducto;
        this.nombreProducto = nombreProducto;
        this.PrecioProducto = PrecioProducto;
        this.CantidadProducto = CantidadProducto;
        this.imagen = imagen;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCategoriaProducto() {
        return CategoriaProducto;
    }

    public void setCategoriaProducto(String CategoriaProducto) {
        this.CategoriaProducto = CategoriaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public int getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCantidadProducto(int CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }

    public byte [] getImagen() {
        return imagen;
    }

    public void setImagen(byte [] imagen) {
        this.imagen = imagen;
    }
    
    
    
    public void imprimir() {
    
        System.out.println("La categoría del producto es: " + CategoriaProducto);
        System.out.println("El nombre del producto es: " + nombreProducto);
        System.out.println("El producto tiene un precio de: $" + PrecioProducto);
        System.out.println("Hay un stock de: " + CantidadProducto);
    
    }

}
