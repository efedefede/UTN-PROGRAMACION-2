/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;


public class Vaca extends Animal {
            @Override
    public void hacerSonido() {
        System.out.println("¡Muuuu!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Animal sagrado en India.");
    }
}
