/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg8.interfaces.y.exepciones;

/**
 *
 * @author fede
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    
    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta " + numeroTarjeta);
    }
    
    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + porcentaje + "% en tarjeta de crédito");
    }
}


