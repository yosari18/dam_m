/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

/**
 * @author yosari
 */
public class Article {

    private String nombre;
    private double preu;
    private double IVA;
    private static final double IVA1 = 21;
    private static final double IVA2 = 10;
    private static final double IVA3 = 4;
    private int cuantasQuedan;

    /*
   Comprobamos que los parÃ¡metros estÃ©n correctos, de lo contrario, se mostrarÃ¡ un mensaje de error.
     */
    public Article(String nombre, double preu, double IVA, int cuantasQuedan) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("***ERROR:  El nom no pot estar buit");
        }
        if (preu >= 1) {
            this.preu = preu;
        } else {
            System.out.println("ERROR: El preu no pot ser menor que 0");
        }
        if (IVA == IVA1 || IVA == IVA2 || IVA == IVA3) {
            this.IVA = IVA;
        } else {
            System.out.println("*** ERROR:  IVA " + IVA + "% no valid");
        }
        if (cuantasQuedan > 0) {
            this.cuantasQuedan = cuantasQuedan;
        } else {
            System.out.println("*** ERROR: El stock no pot ser menor que 0");
        }
    }

    public String getNom() {
        return nombre;
    }

    public double getPreu() {
        return preu;
    }

    public double getIVA() {
        return IVA;
    }

    public int getQuantsQueden() {
        return cuantasQuedan;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("***ERROR:  El nom no pot estar buit");
        }
    }

    public void setPreu(double precioSinIva) {
        if (precioSinIva > 0) {
            this.preu = precioSinIva;
        } else {
            System.out.println("***ERROR: El preu no pot ser menor que 0");
        }
    }

    /*
    @param si el parámetro es incorrecto muestra mensaje de error
     */
    public void setIva(double IVA) {
        if (IVA == IVA1 || IVA == IVA2 || IVA == IVA3) {
            this.IVA = IVA;
        } else {
            System.out.println("*** ERROR:  IVA " + IVA + "% no vàlid");
        }
    }

    /*
    @param recibe la cantidad de producto
     */
    public int setQuantsQueden(int cuantasQuedan) {
        if (cuantasQuedan < 0) {
            System.out.println("*** ERROR: El stock no pot ser menor que 0");
        } else {
            return this.cuantasQuedan = cuantasQuedan;
        }
        return 0;
    }

    /*
    @return devuelve el precio con el iva aplicado
     */
    public double getPVP() {
        return (this.preu / 100.0 * this.IVA) + this.preu;
    }

    /*
    @param El porcentaje de descuento a aplicar
    @return Devuelve el precio con el porcentaje aplicado
     */
    public double getPVPDescompte(int cant) {
        return (this.getPVP() - this.getPVP()) * cant / 100.0;
    }

    /*
    @param Recibe la cantidad de venta y descuenta lo que hay el stock
     */
    public boolean vendre(int cantidad) {
        if (cantidad <= this.cuantasQuedan) {
            this.cuantasQuedan -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    /*
    @param Recibe la cantidad de productos y lo actualiza
     */
    public boolean emmagatzema(int cantida) {
        if (cantida < 0) {
            System.out.println("Error: No se puede almacenar una cantidad negativa de artÃ­culos.");
            return false;
        }
        this.cuantasQuedan += cantida;
        return true;
    }

    /*
    Muestra el producto con toda su información
     */
    public void imprimeix() {
        System.out.println(getNom() + " - Preu: " + getPreu() + " - IVA: " + this.getIVA() + "% - PVP: " + getPVP() + "â¬ (queden " + this.setQuantsQueden(cuantasQuedan) + " articles )");
    }
}
