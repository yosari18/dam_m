/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotes_ejercici;

/**
 *
 * @author yosari
 */
public class Canari extends Aus {

    private String color;
    private boolean canta;

    public Canari( String nombre, int edad, String estado, int fecha_nacimiento, String tipoPico, boolean vuela,String color, boolean canta) {
        super(nombre, edad, estado, fecha_nacimiento, tipoPico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public void volar() {
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre              : "+this.getNombre());
        System.out.println("Edad                : "+this.getEdad());
        System.out.println("Esado               : "+this.getEstado());
        System.out.println("Fecha de nacimiento : "+this.getFecha_nacimiento());
        System.out.println("Color               : "+ this.color);
        System.out.println("Canta               : "+ this.canta);
    }

    @Override
    public void hablar() {
    }

}
