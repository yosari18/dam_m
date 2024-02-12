/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

import java.util.logging.Logger;

/**
 *
 * @author yosari
 */
public class Article {

    private String nombre;
    private double precioSinIva;
    private double IVA;
    private int cuantasQuedan;

    public Article(String nombre, double precioSinIva, double IVA, int cuantasQuedan) {
        if (nombre.equals(nombre) && precioSinIva >= 1 && IVA == 0.21 && cuantasQuedan > 1) {
            this.nombre = nombre;
            this.precioSinIva = precioSinIva;
            this.IVA = IVA;
            this.cuantasQuedan = cuantasQuedan;
        } else {
            System.out.println("**ERROR  Algunos de los valores que ingreso son incorrectos ");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public double getIVA() {
        return IVA;
    }

    public int getCuantasQuedan() {
        return cuantasQuedan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public void setCuantasQuedan(int cuantasQuedan) {
        this.cuantasQuedan = cuantasQuedan;
    }

}
