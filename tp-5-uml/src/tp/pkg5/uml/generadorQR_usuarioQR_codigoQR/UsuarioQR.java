/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.uml.generadorQR_usuarioQR_codigoQR;

/**
 *
 * @author fede
 */
public class UsuarioQR {

    private String nombre;
    private String email;

    public UsuarioQR(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioQR{" + "nombre=" + nombre + ", email=" + email + '}';
    }

}
