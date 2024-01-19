/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class METODOS_MATH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
abs(x): Devuelve el valor absoluto de x.
ceil(x): Devuelve el entero más pequeño que es mayor o igual a x.
floor(x): Devuelve el entero más grande que es menor o igual a x.
max(x, y): Devuelve el mayor de x e y.
min(x, y): Devuelve el menor de x e y.
pow(x, y): Devuelve x elevado a la potencia de y.
random(): Devuelve un número aleatorio entre 0 y 1.
round(x): Devuelve el entero más cercano a x.
sqrt(x): Devuelve la raíz cuadrada de x.
E: el número de Euler (2.718281828459045)
PI: el número pi (3.141592653589793)
         */

        double x = -2.5;
        double y = 3.7;
        double absX = Math.abs(x);   // absX = 2.5
        double maxXY = Math.max(x, y);  // maxXY = 3.7
        double powX = Math.pow(x, 2);  // powX = 6.25
        System.out.println(absX);
        System.out.println(maxXY);
        System.out.println(powX);
        
        
        
        //RADIO
        double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area del circulo con radio %f es : %.2f %n", radio, area );
        
        //Cálculo del interés compuesto:
        double capitalInicial = 10000;
        double tasaInteres = 0.05; // 5% anual
        int años = 5;
        double capitalFinal = capitalInicial * Math.pow(Math.E, tasaInteres * años);
        System.out.printf("El capital final despues de %d anos es: %.2f %n " ,  años , capitalFinal);
        
        //Funciones de redondeo y truncamiento
        double numero = 5.3;
        double resultado = Math.ceil(numero);
        System.out.println("Redondeando hacia arriba el numero " + numero + ": " + resultado);
        
        double numero1 = 5.7;
        double resultado1 = Math.floor(numero1);
        System.out.println("Redondeando hacia abajo el numero " + numero1 + ": " + resultado1);
        
        double numero2 = 5.5;
        long resultado2 = Math.round(numero2);
        System.out.println("Redondeando al entero mas cercano el numero " + numero2 + ": " + resultado2);
        
        //Funciones de potenciación y radicación
        double base = 5;
        double exponente = 3;
        double resultado3 = Math.pow(base, exponente);
        System.out.println("El numero " + base + " elevado a la potencia " + exponente + " es: " + resultado3);
        
        
        double numero4 = 25;
        double resultado4 = Math.sqrt(numero4);
        System.out.println("La raiz cuadrada del numero " + numero4 + " es: " + resultado4);
        
        double numero5 = 27;
        double resultado5 = Math.cbrt(numero);
        System.out.println("La raiz cubica del numero " + numero5 + " es: " + resultado5);
        
        
        
        //Funciones de comparación y selección de valores
        int num1 = 5;
        int num2 = 10;
        int minimo = Math.min(num1, num2);
        System.out.println("El menor entre " + num1 + " y " + num2 + " es: " + minimo);
        
         int maximo = Math.max(num1, num2);
        System.out.println("El mayor entre " + num1 + " y " + num2 + " es: " + maximo);
        
        int num = -10;
        int absoluto = Math.abs(num);
        System.out.println("El valor absoluto de " + num + " es: " + absoluto);
        
        int min=3;
        int max=5;
        int resultadoo=(int) (Math.random()*(max-min+1)+min);
        
        
    }

}
