
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

                case "a"://Pedimos valores al usuario
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
                    while (numfilas >= arr.length) {//Si el numero de filas que ingreso no es correcto vuelve a pedir
                        System.out.println("La fila " + numfilas + " no existes");
                        System.out.print("Introduce numero de filas :");
                        numfilas = entrada.nextInt();

                    }

                    for (int i = numfilas; i < arr.length; i++) {
                        int suma = 0;//Esta variable esta dentro del for porque en cada iteracion se inicializa el valor 0
                        for (int j = 0; j < arr[i].length; j++) {
                            suma = suma + arr[i][j];

                        }

                        System.out.println(Arrays.toString(arr[i]) + " = " + suma);//Mostramos el arrays de filas y la suma 
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
                    int res = 0;

                   
                    System.out.print("[");
                    for (int i = 0; i < arr.length; i++) {

                        for (int j = colum; j < arr.length; j++) {//columnas
                            suma = suma + arr[i][j];
                            res = arr[i][j];//pasamos los valores  para ejecutar el array de columnas
                            break;

                        }
                        System.out.print(res + ", ");

                    }
                    System.out.print("]");
                    System.out.println("=" + suma);

                    break;
                case "d":
                    int sum = 0;
                    int arr2;
                     System.out.print("[");
                    for (int i = 0; i < arr.length; i++) {
                       
                        for (int j = 0; j < arr.length; j++) {
                            if (Arrays.equals(arr[i], arr[j])) {//Comparamos si las posiciones son iguales
                                sum = sum + arr[i][j];
                                arr2 = arr[i][j];//Pasamos los valores para ejecutar
                                System.out.print(arr2+", ");

                            }
                            

                        }
                       

                    }
                     System.out.print("]");
                    System.out.println("= "+sum);

                    break;
                case "e":
                    int sumadig=0;
                    int resul;
                    System.out.print("[");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = arr.length; j < arr[i].length+1; j--) {
                           sumadig=sumadig+arr[i][j];
                          // resul=arr[i][j];
                           // System.out.println(resul);
                           /*resul=arr[i][j];*/
                          break;
                        }
                        
                    }
                    System.out.println("= "+sumadig);

                    break;
                case "f":
                    int sumMedia = 0;

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sumMedia = sumMedia + arr[i][j];
                        }
                    }
                    int media = sumMedia / arr.length;
                    System.out.println("La media es " + media);

                    break;

                default:
                    System.out.println("sdg");
            }
            entrada.nextLine();
        } while (true);
    }

}
