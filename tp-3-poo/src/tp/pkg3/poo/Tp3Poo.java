/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg3.poo;

/**
 *
 * @author fede
 */
public class Tp3Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ACTIVIDAD 1.
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Fede";
        estudiante.apellido = "Panella";
        estudiante.curso = "POO";
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(10.0);
        estudiante.mostrarInfo();
        estudiante.bajarCalificacion(0.5);
        estudiante.mostrarInfo();
        
        //ACTIVIDAD 2.
        Mascota garcia = new Mascota();
        garcia.nombre = "García";
        garcia.especie = "Gato";
        garcia.mostrarInfo();
        garcia.cumplirAnios(6);
        garcia.mostrarInfo();
        
        //ACTIVIDAD 3.
        Libro ejemplo = new Libro();
        ejemplo.setAnioPublicacion(-10);
        ejemplo.getAnioPublicacion();
        ejemplo.setAnioPublicacion(1900);
        ejemplo.getAnioPublicacion();
        
        //ACTIVIDAD 4.
        Gallina turuleca = new Gallina();
        Gallina josefina = new Gallina();
        
        turuleca.ponerHuevo(4);
        turuleca.envejecer();
        turuleca.mostrarEstado();
        
        josefina.envejecer();
        josefina.envejecer();
        josefina.ponerHuevo(2);
        josefina.mostrarEstado();
        
        //ACTIVIDAD 5.
        NaveEspacial nave = new NaveEspacial();
        nave.recargarCombustible(50);
        nave.avanzar(60);
        nave.recargarCombustible(11);
        nave.avanzar(60);
        nave.mostrarEstado();
        
    }
    
}
