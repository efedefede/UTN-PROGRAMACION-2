/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.uml.documento_firmaDigital_usuario;

/**
 *
 * @author fede
 */
public class FirmaDigital {

    private String codigoHash;
    private String fecha;
    private UsuarioDoc usuario;

    public FirmaDigital(String codigoHash, String fecha, UsuarioDoc usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public UsuarioDoc getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario.toString() + '}';
    }

}
