/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

/**
 *
 * @author yosari
 */
public class Article {
    String nombre;
    double precioSinIva;
    double IVA;
    int cuantasQuedan;
    
    public Article (String nombre, double precioSinIva,double IVA, int cuantasQuedan ){
        if(nombre.equals(nombre) && precioSinIva>=1 && IVA == 0.21 && cuantasQuedan >1 ){
            this.nombre=nombre;
            this.precioSinIva=precioSinIva;
            this.IVA=IVA;
            this.cuantasQuedan=cuantasQuedan;
        }else{
            System.out.println("**ERROR  Algunos de los valores que ingreso son incorrectos ");
        }
    
    }
    
}
