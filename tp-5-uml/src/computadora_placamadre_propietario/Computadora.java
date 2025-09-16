/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora_placamadre_propietario;

/**
 *
 * @author fede
 */
public class Computadora {

    private String marca;
    private String numeroDeSerie;
    private PlacaMadre placa;
    private Propietario propietario;

    public Computadora(String marca, String numeroDeSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
        this.placa = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroDeSerie=" + numeroDeSerie + ", placa=" + placa.toString() + ", Nombre del propietario=" + propietario.getNombre() + '}';
    }

}
