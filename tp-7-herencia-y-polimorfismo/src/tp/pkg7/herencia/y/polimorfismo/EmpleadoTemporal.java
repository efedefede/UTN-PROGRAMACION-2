/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;


public class EmpleadoTemporal extends Empleado {
    private double sueldo;

    public EmpleadoTemporal(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldo;
    }
    
}
