/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.uml.generadorQR_usuarioQR_codigoQR;

/**
 *
 * @author fede
 */
public class GeneradorQR {

    public void generar(String valor, UsuarioQR user) {
        CodigoQR cod = new CodigoQR(valor, user);

        System.out.println("Código generado: " + cod.toString());
    }
}
