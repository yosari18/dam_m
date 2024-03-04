/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotes_ejercici;

/**
 *
 * @author yosari
 */
public class Gat extends Mascota {

    private String color;
    private boolean peloLargo;

    public Gat(String nombre, int edad, String estado, int fecha_nacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre              : "+this.getNombre());
        System.out.println("Edad                : "+this.getEdad());
        System.out.println("Esado               : "+this.getEstado());
        System.out.println("Fecha de nacimiento : "+this.getFecha_nacimiento());
        System.out.println("Color               : "+ this.color);
        System.out.println("Tiene pelo largo    : "+ this.peloLargo);
    }

    @Override
    public void hablar() {

    }

}
