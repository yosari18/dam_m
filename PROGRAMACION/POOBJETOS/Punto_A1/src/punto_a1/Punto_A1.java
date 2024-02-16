/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_a1;


/**
 *
 * @author yosari
 */
public class Punto_A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Coordenadas arr[] = new Coordenadas[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Coordenadas.creaPuntoAleatorio();
            arr[i].imprime();

        }

    }

}
