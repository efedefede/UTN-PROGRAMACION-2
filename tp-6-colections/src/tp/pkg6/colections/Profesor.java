/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg6.colections;

/**
 *
 * @author fede
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Agregar curso (sincronización bidireccional)
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            // Sincronizar el lado del curso
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }

    // Eliminar curso (sincronización bidireccional)
    public void eliminarCurso(Curso curso) {
        if (cursos.remove(curso)) {
            // Sincronizar el lado del curso
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }

    // Listar cursos
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no tiene cursos asignados.");
            return;
        }
        System.out.println("\nCursos de " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getCodigo() + ": " + curso.getNombre());
        }
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre
                + " | ID: " + id
                + " | Especialidad: " + especialidad
                + " | Cursos: " + cursos.size());
    }
}
