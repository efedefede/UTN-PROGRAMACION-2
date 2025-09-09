/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg4.poo;

/**
 *
 * @author fede
 */
public class Tp4Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp1 = new Empleado(1, "Fede Panella", "dev", 10000.00);
        Empleado emp2 = new Empleado("Federico Pane", "java-dev");

        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println("Cantidad de empleados: " + Empleado.mostrarTotalEmpleados());

        emp2.actualizarSalario(50);
        emp1.actualizarSalario(10.0);

        System.out.println(emp1);
        System.out.println(emp2);

    }

}
