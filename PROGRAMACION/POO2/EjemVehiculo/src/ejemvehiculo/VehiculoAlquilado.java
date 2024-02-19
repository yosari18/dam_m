/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemvehiculo;

/**
 *
 * @author yosari
 */
public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int yearAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int yearAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.yearAlquiler = yearAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public int getMesAlquiler() {
        return this.mesAlquiler;
    }

    public int getYearAlquiler() {
        return this.yearAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return this.totalDiasAlquiler;
    }
    
    
}
