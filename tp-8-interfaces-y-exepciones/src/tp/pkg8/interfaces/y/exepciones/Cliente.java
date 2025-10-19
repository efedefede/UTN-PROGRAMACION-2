/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg8.interfaces.y.exepciones;

/**
 *
 * @author fede
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificarCambioEstado(Pedido pedido, String nuevoEstado) {
        System.out.println("Notificación para " + nombre + ": Pedido cambió a estado '" + nuevoEstado + "'");
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}
