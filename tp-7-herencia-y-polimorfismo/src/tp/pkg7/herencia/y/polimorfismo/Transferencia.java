/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

public class Transferencia implements Pagable {

    private String cuentaOrigen;
    private String cuentaDestino;

    public Transferencia(String o, String d) {
        this.cuentaOrigen = o;
        this.cuentaDestino = d;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Tensferencia de $" + monto + " desde " + cuentaDestino + " a " + cuentaOrigen);

    }

}
