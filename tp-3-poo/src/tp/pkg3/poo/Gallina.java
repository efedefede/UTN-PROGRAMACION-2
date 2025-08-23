/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3.poo;

import java.util.UUID;

/**
 *
 * @author fede
 */
public class Gallina {

    private UUID idGallina = UUID.randomUUID();
    private int edad;
    private int huevosPuestos;

    public void ponerHuevo(int cantidad) {
        if (cantidad > 0) {
            huevosPuestos += cantidad;
        }
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("id: " + idGallina + " Edad: " + edad + " Huevos puestos: " + huevosPuestos);
    }
}
