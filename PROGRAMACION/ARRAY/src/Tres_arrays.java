
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Tres_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         4. Define tres arrays de 20 números enteros cada una, con nombres
 *    “numero”, “cuadrado” y “cubo”. Carga el array “numero” con valores
 *    aleatorios entre 0 y 100. En el array “cuadrado” se deben almacenar
 *    los cuadrados de los valores que hay en el array “numero”. En el
 *    array “cubo” se deben almacenar los cubos de los valores que hay
 *    en “numero”. A continuación, muestra el contenido de los tres arrays
 *    dispuesto en tres columnas.
        */
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101 + 0);

            cuadrado[i] = (int) Math.pow(numero[i], 2);
            cubo[i] = (int) Math.pow(numero[i], 3);
            
           
            
        }
         System.out.print("Array numero : "+Arrays.toString(numero));
         System.out.println("\nArray al cuadrado : "+Arrays.toString(cuadrado));
         System.out.println("Array al cubo : "+Arrays.toString(cubo));
    }

}
