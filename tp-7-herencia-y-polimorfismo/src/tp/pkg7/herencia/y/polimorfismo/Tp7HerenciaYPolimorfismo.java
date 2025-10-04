/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg7.herencia.y.polimorfismo;

/**
 *
 * @author fede
 */
public class Tp7HerenciaYPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Consigna 1: Instanciar un auto y mostrar su información completa. 
        System.out.println("-------------PUNTO 1------------------");
        Auto a = new Auto("V.W", "Gol", 5);
        System.out.println(a.mostrarInfo());
        System.out.println("-----------------------------------------");
        // Consigna 2: Crear un array de figuras y mostrar el área de cada una usando polimorfismo.
        System.out.println("-------------PUNTO 2------------------");
        Figura[] figuras = new Figura[4];

        figuras[0] = new Circulo("Rojo", 5.0);
        figuras[1] = new Rectangulo("Verde", 4.0, 6.0);
        figuras[2] = new Circulo("Azul", 3.5);
        figuras[3] = new Rectangulo("Violeta", 2.0, 8.0);

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
        System.out.println("------------------------------------------");
        // Consigna 3: Crear lista de empleados, invocar calcularSueldo() polimórficamente, usar instanceof para clasificar 
        System.out.println("-------------PUNTO 3------------------");
        Empleado[] empleados = new Empleado[5];

        empleados[0] = new EmpleadoPlanta(20000.0);
        empleados[1] = new EmpleadoTemporal(30000.0);
        empleados[2] = new EmpleadoTemporal(40000.0);
        empleados[3] = new EmpleadoPlanta(70000.0);
        empleados[4] = new EmpleadoPlanta(100000.0);

        for (Empleado e : empleados) {
            System.out.println((e instanceof EmpleadoPlanta ? "Sueldo de empleado de planta " : "Sueldo de empleado temporal ") + e.calcularSueldo());
        }
        System.out.println("-----------------------------------------");
        // Consigna 4: Crear lista de animales y mostrar sus sonidos con polimorfismo 
        System.out.println("-------------PUNTO 4------------------");
        Animal[] animales = new Animal[5];

        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Vaca();
        animales[3] = new Gato();
        animales[4] = new Perro();

        for (Animal an : animales) {
            an.hacerSonido();
        }
        System.out.println("-------------------------------------------");
        // Consigna 5: Crear distintas formas de pago y procesarlas con una sola función 
        System.out.println("-------------PUNTO 5------------------");
        Pagable tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Pérez");
        Pagable transferencia = new Transferencia("ES12-1234-5678", "ES98-8765-4321");
        Pagable efectivo = new Efectivo();

        ProcesarPago.procesarPago(tarjeta, 150.75);
        ProcesarPago.procesarPago(transferencia, 299.99);
        ProcesarPago.procesarPago(efectivo, 85.50);
    }

}
