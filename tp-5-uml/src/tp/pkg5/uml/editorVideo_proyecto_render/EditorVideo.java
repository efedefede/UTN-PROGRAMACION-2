/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg5.uml.editorVideo_proyecto_render;

/**
 *
 * @author fede
 */
public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto);

        System.out.println("Render exportado: " + r.toString());
    }
}
