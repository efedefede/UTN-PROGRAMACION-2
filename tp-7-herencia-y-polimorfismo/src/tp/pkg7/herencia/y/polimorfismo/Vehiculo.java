/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

/**
 *
 * @author fede
 */
public abstract class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrarInfo() {
        return "Marca " + marca + " Modelo: " + modelo;
    }
}
