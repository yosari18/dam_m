
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Scanner teclado = new Scanner(System.in);
        int login = 0;
        int pass = 0;
        int intentos = 1;
        int maximo = 3;

        while ((login != 1809) || (pass != 1234) && (intentos < maximo)) {

            System.out.print("introduzca un login: ");
            login = teclado.nextInt();
            System.out.print("Introduzca su pass:");
            pass = teclado.nextInt();

            if (intentos == 3) {
                System.out.println("acceso denegado..");
                intentos = intentos - maximo;
            }

            intentos++;

        }

        System.out.println("login y pass, correctos...");*/

        
        
        
        /*Scanner in = new Scanner(System.in);

        String usuario = "";
        int contraseña = 0;
        int contraseña1 = 123;
        String usuario1 = "Federico";
        String usuario2 = "0";
        int cero = Integer.parseInt(usuario2);

        System.out.println("*******************************************");
        System.out.println("*****Bienvenido al cajero de Banco UTN*****");
        System.out.println("*******************************************");
        System.out.println("");

        System.out.println("Ingrese el Usuario: ");
        usuario = in.nextLine();
        System.out.println("");

        System.out.println("Ingrese la Contraseña: ");
        contraseña = in.nextInt();
        System.out.println("");

        if (usuario.equals(usuario1) && contraseña == contraseña1) {

            System.out.println("Bienvenido Usuario: " + usuario1);

        } else if ((!usuario.equals(usuario1) || contraseña != contraseña1) && !usuario.equals(usuario2)) {

            System.out.println("ERROR DE USUARIO O CONTRASEÑA");

        } else if (usuario.equals(usuario2)) {

            System.out.println("GRACIAS POR USAR NUESTRO SISTEMA");

        } else {

        }*/
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Bienvenido al programa de contraseñas.");
            
            System.out.println("Crea aqui tu contraseña nueva: ");
            String contraseña = scanner.nextLine();
            
            String contraseñasIntentos;
            int numero = 0;
            
           for (int i = 1; i <= 5; i++) {
                System.out.println("Ingresa tu contraseña: ");
                contraseñasIntentos = scanner.nextLine();
                if (contraseñasIntentos.equals(contraseña))  {
                    numero += 1;
                }
            }
            
            if (numero >= 1) {
                System.out.println("Ingresaste la contraseña correcta " + numero + " vez/veces.");
            }
            else {
                System.out.println("Ninguna es la contraseña correcta.");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Hubo un error.");
        }
        finally {
            System.out.println("Adios.");
        }
       
    }
}
   
