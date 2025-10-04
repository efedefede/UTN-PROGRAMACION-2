/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

public class EmpleadoPlanta extends Empleado {

    private final double PORCENTAJE_DE_IMPUESTOS = 0.20;
    private double sueldo;

    public EmpleadoPlanta(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldo - this.sueldo * PORCENTAJE_DE_IMPUESTOS;
    }

}
