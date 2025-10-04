/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

/**
 *
 * @author fede
 */
public class ProcesarPago {

    public static void procesarPago(Pagable medioPago, double monto) {
        System.out.println("=== INICIANDO PROCESO DE PAGO ===");
        medioPago.pagar(monto); // Polimorfismo
        System.out.println("=== PAGO FINALIZADO ===");
    }
}
