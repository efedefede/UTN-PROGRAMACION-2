/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("El mejor amigo del hombre");
    }
}
