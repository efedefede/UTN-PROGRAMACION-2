/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.uml.cuentaBancaria_claveSeguridad_titular;

/**
 *
 * @author fede
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private TitularCuenta titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public void setTitular(TitularCuenta titular) {
        this.titular = titular;

        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    public TitularCuenta getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave.toString() + ", titular=" + titular.toString() + '}';
    }

}
