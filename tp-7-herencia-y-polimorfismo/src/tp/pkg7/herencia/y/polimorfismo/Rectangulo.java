/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

public class Rectangulo extends Figura {

    private double base;
    private double altura;
    private String color;

    public Rectangulo(String color, double b, double h) {
        super(color);
        this.base = b;
        this.altura = h;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

}
