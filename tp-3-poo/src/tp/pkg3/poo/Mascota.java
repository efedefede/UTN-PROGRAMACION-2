/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3.poo;

/**
 *
 * @author fede
 */
public class Mascota {

    String nombre;
    String especie;
    private int edad;

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " Especie: " + especie + " edad: " + edad);
    }

    public void cumplirAnios(int anios) {
        if (anios > 0) {
            edad += anios;
        }
    }
}
