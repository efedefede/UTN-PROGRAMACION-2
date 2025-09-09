/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4.poo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fede
 */
public class Empleado {

    private static final Set<Integer> idsUsados = new HashSet<>();
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.setId(id, true);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.setId(totalEmpleados + 1000, false);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100.0;
    }

    public void actualizarSalario(int porcentaje) {
        if (porcentaje > 0) {
            salario += ((salario * porcentaje) / 100);
        }
    }

    public void actualizarSalario(double monto) {
        if (monto > 0) {
            salario += monto;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    private void setId(int id, boolean idIsExternal) {
        if (idIsExternal && idsUsados.contains(id)) {
            throw new IllegalArgumentException("ID ya está en uso: " + id);
        }
        while (!idIsExternal && idsUsados.contains(id)) {
            id++;
        }
        this.id = id;

        idsUsados.add(id);
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.length() == 0) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
