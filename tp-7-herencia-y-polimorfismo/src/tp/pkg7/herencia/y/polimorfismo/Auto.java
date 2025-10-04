/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

public class Auto extends Vehiculo {

    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int cantidadDePuertas) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " Cantidad de puertas: " + cantidadDePuertas;
    }

}
