/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cuenta;

/**
 * 1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular
 * y cantidad (puede tener decimales).
 *
 * El titular será obligatorio y la cantidad es opcional. Crea dos constructores
 * que cumpla lo anterior.
 *
 * Crea sus métodos get, set y toString.
 *
 * Tendrá dos métodos especiales:
 *
 * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la
 * cantidad introducida es negativa, no se hará nada. retirar(double cantidad):
 * se retira una cantidad a la cuenta, si restando la cantidad actual a la que
 * nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 *
 */
public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {

        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad " + cantidad + " es negativa");
        } else {
            this.cantidad += cantidad;
            System.out.println("ingreso " + cantidad + " cantidad actual " + this.cantidad);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad - cantidad;
            if (this.cantidad < 0) {
                this.cantidad = 0;
            }
            System.out.println("Se retiro " + cantidad + " cantidad actual " + this.cantidad);
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + this.titular + ", cantidad=" + this.cantidad + '}';
    }

}
