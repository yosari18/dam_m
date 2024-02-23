/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayproducto;

/**
 *
 * @author yosari
 */
public class Producto {
    
    String nomP;
    int cantidad;

    public Producto(String nomP, int cantidad) {
        this.nomP = nomP;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public String getNomP() {
        return nomP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
   
}
