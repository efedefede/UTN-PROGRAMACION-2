/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.uml.cuentaBancaria_claveSeguridad_titular;

/**
 *
 * @author fede
 */
public class TitularCuenta {

    private String codigo;
    private String ultimaModificacion;
    private CuentaBancaria cuenta;

    public TitularCuenta(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "TitularCuenta{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }

}
