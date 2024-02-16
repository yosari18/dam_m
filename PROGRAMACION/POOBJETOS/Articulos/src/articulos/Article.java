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

    private String nombre;
    private double precioSinIva;
    private final double IVA = 0.21;
    private int cuantasQuedan;

    public Article(String nombre, double precioSinIva, int cuantasQuedan) {
        if (nombre.equals(nombre) && precioSinIva >= 1 && IVA == 0.21 && cuantasQuedan > 1) {
            this.nombre = nombre;
            this.precioSinIva = precioSinIva;
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
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Tenemos errores en el nombre");
        }

    }

    public void setPrecioSinIva(double precioSinIva) {
        if (this.precioSinIva > 0) {
            this.precioSinIva = precioSinIva;
        } else {
            System.out.println("Tenemos errores en precio sin iva ");
        }

    }

    public void setIVA(double IVA) {

    }

    public void setCuantasQuedan(int cuantasQuedan) {
        if (this.cuantasQuedan > 1) {
            this.cuantasQuedan = cuantasQuedan;
        } else {
            System.out.println("Tenemos errores en cantidades de producto");
        }
    }

    public double getPVP() {
        return getPrecioSinIva() * (getIVA() + 1);
    }

    public double getPVPDescuento() {
        return getPrecioSinIva() * (getIVA());
    }

    public boolean getvender(int cantidad) {
       if (cantidad <= this.cuantasQuedan) {
            this.cuantasQuedan -= cantidad;
            return true;
        } else {
            System.out.println("Error: No hay suficiente stock para vender " + cantidad + " unidades del artículo '" + nombre + "'.");
            return false;
        }
    }

    public boolean almacena(int cantida) {
        if (cantida < 0) {
            System.out.println("Error: No se puede almacenar una cantidad negativa de artículos.");
            return false;
        }

        // Actualizar el stock sumando o restando la cantidad según sea necesario
        this.cuantasQuedan += cantida;
        return true;
    }

    public void imprime() {
        System.out.println("Producto : " + getNombre() + "\nPrecio   : " + getPrecioSinIva() + "\nIVA      : " + (getIVA()) + "%\nPVP      : " + getPVP() + "€");

    }

}
