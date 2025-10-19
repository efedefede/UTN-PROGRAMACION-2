/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg8.interfaces.y.exepciones;

/**
 *
 * @author fede
 */
public class ValidadorEdad {

    public void validarEdad(int edad) throws EdadInvalidaExeption {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaExeption("Edad " + edad + " no válida. Debe estar entre 0 y 120");
        }
        System.out.println("Edad válida: " + edad);
    }
}
