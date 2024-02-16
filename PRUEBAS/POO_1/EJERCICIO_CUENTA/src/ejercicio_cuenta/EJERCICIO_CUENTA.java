/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_cuenta;

/**
 *
 * @author yosari
 */
public class EJERCICIO_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta("yoss", 34);

        System.out.println(c1);
        c1.retirar(4);
        c1.retirar(2);

        c1.ingresar(5);
        c1.ingresar(1);
        c1.ingresar(5);
        c1.retirar(45);
    }

}
