/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotes_ejercici;

/**
 *
 * @author yosari
 */
public class Gos extends Mascota {

    private String raza;
    private boolean tiene_pulgas;

    public Gos( String nombre, int edad, String estado, int fecha_nacimiento,String raza, boolean tiene_pulgas) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.raza = raza;
        this.tiene_pulgas = tiene_pulgas;
    }

   

    public void mostrar() {
        System.out.println("Nombre              : "+this.getNombre());
        System.out.println("Edad                : "+this.getEdad());
        System.out.println("Esado               : "+this.getEstado());
        System.out.println("Fecha de nacimiento : "+this.getFecha_nacimiento());
        System.out.println("Raza                : "+ this.raza);
        System.out.println("Tiene pulgas ?      : "+ this.tiene_pulgas);
       
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTiene_pulgas(boolean tiene_pulgas) {
        this.tiene_pulgas = tiene_pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isTiene_pulgas() {
        return tiene_pulgas;
    }

    public void hablar() {

    }

   

}
