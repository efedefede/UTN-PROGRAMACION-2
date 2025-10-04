/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

public class TarjetaCredito implements Pagable {

    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " procesado con Tarjeta Numero: " + numeroTarjeta + "De " + titular);
        System.out.println("Transacción aprobada");
    }

}
