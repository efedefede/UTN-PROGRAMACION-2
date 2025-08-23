/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3.poo;

/**
 *
 * @author fede
 */
public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    private double calificacion;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " curso: " + curso + " Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion += puntos;
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion -= puntos;
        }
    }
}
