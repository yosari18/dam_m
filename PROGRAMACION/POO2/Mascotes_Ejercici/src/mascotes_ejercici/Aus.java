/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotes_ejercici;

/**
 *
 * @author yosari
 */
public abstract class Aus extends Mascota{
    private String tipoPico;
    private boolean vuela;

    public Aus( String nombre, int edad, String estado, int fecha_nacimiento,String tipoPico, boolean vuela) {
        super(nombre, edad, estado, fecha_nacimiento);
        this.tipoPico = tipoPico;
        this.vuela = vuela;
    }
    
    public abstract void  volar();
    
}
