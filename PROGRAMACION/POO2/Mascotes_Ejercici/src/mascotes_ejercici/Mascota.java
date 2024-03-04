/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotes_ejercici;

/**
 *
 * @author yosari
 */
public abstract class Mascota {

    private String nombre;
    private int edad;
    private String estado;
    private int fecha_nacimiento;

    public Mascota(String nombre, int edad, String estado, int fecha_nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public abstract void mostrar();

    public abstract void hablar();

    public  void aniversari(){}

    public  void morir(){}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public int getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha_nacimiento(int fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    

}
