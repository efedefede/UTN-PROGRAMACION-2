/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg8.interfaces.y.exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author fede
 */
public class Tp8InterfacesYExepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Probando el sistema de e-commerce
        Cliente cliente = new Cliente("Juan Pérez", "juan@email.com");
        Pedido pedido = new Pedido(cliente);

        Producto producto1 = new Producto("Laptop", 1000.0);
        Producto producto2 = new Producto("Mouse", 50.0);

        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Cambiar estado (debe notificar al cliente)
        pedido.cambiarEstado("ENVIADO");

        // Probar métodos de pago
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        tarjeta.aplicarDescuento(10);
        tarjeta.procesarPago(pedido.calcularTotal());

        // DIVISION SEGURA:
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese dividendo: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese divisor: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida");
        } finally {
            scanner.close();
        }

        // Conversión de cadena a número:
        String texto = null;
        try {
            texto = "123abc";
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir '" + texto + "' a número");
        }

        //Lectura de archivo:
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        //Exepción personalizada:
        ValidadorEdad validador = new ValidadorEdad();

        try {
            validador.validarEdad(25);   // Válida
            validador.validarEdad(150);  // Inválida
            validador.validarEdad(-5);   // Inválida

        } catch (EdadInvalidaExeption e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Try-with-resources cierra automáticamente el BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        // No necesita finally - el recurso se cierra automáticamente
    }

}
