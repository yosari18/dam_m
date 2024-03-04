/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotes_ejercici;

/**
 *
 * @author yosari
 */
public class Lloro extends Aus {

    private String origen;
    private Boolean habla;

    public Lloro(String nombre, int edad, String estado, int fecha_nacimiento, String tipoPico, boolean vuela,String origen, Boolean habla) {
        super(nombre, edad, estado, fecha_nacimiento, tipoPico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

   
    public void volar() {
    }

  
    public void mostrar() {
        System.out.println("Nombre              : "+this.getNombre());
        System.out.println("Edad                : "+this.getEdad());
        System.out.println("Esado               : "+this.getEstado());
        System.out.println("Fecha de nacimiento : "+this.getFecha_nacimiento());
        System.out.println("Origen              : "+ this.origen);
        System.out.println("Habla?              : "+ this.habla);
    }

    
    public void hablar() {
    }

}
