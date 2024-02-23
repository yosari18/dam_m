/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercici_persona;

import java.util.Arrays;
import java.util.Random;

/**
 * 2) Haz una clase llamada Persona que siga las siguientes condiciones:
 *
 * Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y
 * altura. No queremos que se accedan directamente a ellos. Piensa que
 * modificador de acceso es el más adecuado, también su tipo. Si quieres añadir
 * algún atributo puedes hacerlo. Por defecto, todos los atributos menos el DNI
 * serán valores por defecto según su tipo (0 números, cadena vacía para String,
 * etc.). Sexo sera hombre por defecto, usa una constante para ello. Se
 * implantaran varios constructores: Un constructor por defecto. Un constructor
 * con el nombre, edad y sexo, el resto por defecto. Un constructor con todos
 * los atributos como parámetro. Los métodos que se implementaran son:
 * calcularIMC(): calculara si la persona esta en su peso ideal (peso en
 * kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la
 * función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
 * significa que esta por debajo de su peso ideal la función devuelve un 0 y si
 * devuelve un valor mayor que 25 significa que tiene sobrepeso, la función
 * devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
 *
 * esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 *
 * comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si
 * no es correcto, sera H. No sera visible al exterior.
 *
 * toString(): devuelve toda la información del objeto.
 *
 * generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este
 * su número su letra correspondiente. Este método sera invocado cuando se
 * construya el objeto. Puedes dividir el método para que te sea más fácil. No
 * será visible al exterior. Métodos set de cada parámetro, excepto de DNI.
 * Ahora, crea una clase ejecutable que haga lo siguiente:
 *
 * Pide por teclado el nombre, la edad, sexo, peso y altura. Crea 3 objetos de
 * la clase anterior, el primer objeto obtendrá las anteriores variables pedidas
 * por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y
 * la altura y el último por defecto, para este último utiliza los métodos set
 * para darle a los atributos un valor. Para cada objeto, deberá comprobar si
 * esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un
 * mensaje. Indicar para cada objeto si es mayor de edad. Por último, mostrar la
 * información de cada objeto. Puedes usar métodos en la clase ejecutable, para
 * que os sea mas fácil.
 */
public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private String sexo;
    private double peso;
    private double altura;

    public static final int peso_normal = -1;
    public static final int peso_debajo = 0;
    public static final int peso_porEncima = 1;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        int pesoIdeal = (int) ((int) Math.pow(this.altura, 2) / this.peso);
        if (pesoIdeal < 20) {
            return peso_normal;
        } else if (20 >= 25) {
            return peso_debajo;
        } else {
            return peso_porEncima;
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void comprobarSexo(char sexo) {
        if (this.sexo == "H") {
            this.sexo = "H";
        } else {
            this.sexo = "H";
        }
    }

    public void generarDNI() {
        Random ran = new Random();
        int num = 0;
        char let = (char) (ran.nextInt(89) + 65);
        for (int i = 0; i < 8; i++) {
            num = ran.nextInt(8) + 0;
            System.out.print(num);
        }

        System.out.println(let);
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getSexo() {
        return this.sexo;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

}
