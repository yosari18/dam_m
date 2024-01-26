/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_15 {

    public static int suma(int arr[]) {
        int sumat = 0;
        for (int i = 1; i < arr.length+1; i++) {
            sumat = sumat + i;
           
        }
        return sumat;
    }

    public static double media(int arr[]) {
        return   suma(arr) / arr.length;
       //media tiene que se 50,5
    }

    public static void main(String[] args) {
        int arr[] = new int[100];
        System.out.println("La suma total es :" + suma(arr));
        System.out.println("La media es : "+media(arr));

    }

}
