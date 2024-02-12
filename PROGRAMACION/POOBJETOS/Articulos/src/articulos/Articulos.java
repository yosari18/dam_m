/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package articulos;

/**
 *
 * @author yosari
 */
public class Articulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Article Art1 = new Article("camisa", 10, 0.21, 2);
        double precioConIva1 = Art1.precioSinIva * (Art1.IVA + 1);
        System.out.println(Art1.nombre + " - Precio: " + Art1.precioSinIva + "€ - IVA: " + (Art1.IVA * 100) + "% - PVP: " + precioConIva1 + "€");
        System.out.println("");
        Article Art2 = new Article("polo ", 1, 0.21, 2);
        double precioConIva2 = Art2.precioSinIva * (Art2.IVA + 1);
        System.out.println(Art2.nombre + " - Precio: " + Art2.precioSinIva + "€ - IVA: " + (Art2.IVA * 100) + "% - PVP: " + precioConIva2 + "€");

    }

}
