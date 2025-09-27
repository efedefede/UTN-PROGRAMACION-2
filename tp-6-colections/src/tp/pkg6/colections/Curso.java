/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg6.colections;

/**
 *
 * @author fede
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Setter de profesor con sincronización bidireccional
    public void setProfesor(Profesor nuevoProfesor) {
        // Remover de la lista del profesor anterior
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        // Asignar nuevo profesor
        this.profesor = nuevoProfesor;

        // Agregar a la lista del nuevo profesor
        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCurso(this);
        }
    }

    // Mostrar información
    public void mostrarInfo() {
        String profesorNombre = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre
                + " | Código: " + codigo
                + " | Profesor: " + profesorNombre);
    }
}
