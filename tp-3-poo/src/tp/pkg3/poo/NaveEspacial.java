/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg3.poo;

/**
 *
 * @author fede
 */
public class NaveEspacial {

    private String nombre = "nombre por default";
    private int combustible;

    public void despegar() {
        if (combustible > 0) {
            System.out.println("Despegando...");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("Hicimos " + distancia + "kms");
        } else {
            System.out.println("No hay combustible suficiente para avanzar " + distancia + "kms");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            combustible += cantidad;
        }
    }

    public void mostrarEstado() {
        System.out.print("Nombre: " + nombre + " Combustible " + combustible);
    }
}
