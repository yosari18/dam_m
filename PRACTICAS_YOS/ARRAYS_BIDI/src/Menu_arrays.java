
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Menu_arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        4) Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos piden hacer un menú con estas opciones:
        Rellenar TODA la matriz de números, debes pedírselo al usuario. 
        Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
        Suma de una columna que se pedirá al usuario (controlar que elija una correcta) 
        Sumar la diagonal principal (ver ejemplo)
        Sumar la diagonal inversa (ver ejemplo)
        La media de todos los valores de la matriz 
        IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar, simplemente mostrar un mensaje donde diga que debes rellenar la matriz.
         */
        Scanner entrada = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int numfilas;

        int colum;

        do {
            System.out.println("MENU");
            System.out.println("A)Rellenar toda la matri");
            System.out.println("B)Suma de una fila");
            System.out.println("C)Suma de una columna");
            System.out.println("D)Suma la diagonal principal");
            System.out.println("E)Suma la diagonal inversa");
            System.out.println("F)Lamedia de todos los valores de la matriz");
            System.out.print("Elige opcion :");
            String respuesta = entrada.nextLine().toLowerCase();

            switch (respuesta) {

                case "a":
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print("Ingresar valor a la posicion (" + i + ") y (" + j + ") :");
                            arr[i][j] = entrada.nextInt();

                        }

                    }

                    break;
                case "b":
                    System.out.print("Introduce numero de filas :");
                    numfilas = entrada.nextInt();
                    while (numfilas >= arr.length) {
                        System.out.println("La fila " + numfilas + " no existes");
                        System.out.print("Introduce numero de filas :");
                        numfilas = entrada.nextInt();

                    }

                    for (int i = numfilas; i < arr.length; i++) {
                        int suma = 0;
                        for (int j = 0; j < arr[i].length; j++) {
                            suma = suma + arr[i][j];

                        }

                        System.out.println(Arrays.toString(arr[i]) + " = " + suma);
                        break;

                    }

                    break;
                case "c":
                    System.out.print("Ingresa numero de columnas: ");
                    colum = entrada.nextInt();

                    while (colum >= arr.length) {
                        System.out.println("Columna " + colum + " no existe");
                        System.out.print("Ingresa numero de columna: ");
                        colum = entrada.nextInt();
                    }
                    int suma = 0;
                    ////falta terminare

                    for (int i = 0; i < arr.length; i++) {

                        for (int j = colum; j < arr.length; j++) {
                            suma = suma + arr[i][j];
                            System.out.println("fdgf");
                            System.out.println(Arrays.toString(arr[colum]));
                           
                        }

                        System.out.println(suma);

                    }

                    break;
                case "d":
                    int sum = 0;
                    int arr2;   
                    for (int i = 0; i < arr.length; i++) {

                        for (int j = 0; j < arr.length; j++) {
                            if (Arrays.equals(arr[i], arr[j])) {
                                sum = sum + arr[i][j];
                                arr2=arr[i][j];                
                                System.out.println(arr2);

                            }

                        }

                    }
                    System.out.println(sum);

                    break;
                case "e":
                    

                    break;
                case "f":
                    int sumMedia=0;
                    
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sumMedia=sumMedia+arr[i][j];
                        }
                    }
                    int media =sumMedia/arr.length;
                    System.out.println("La media es "+media);

                    break;

                default:
                    System.out.println("sdg");
            }    
            entrada.nextLine();
        } while (true);
    }

}
