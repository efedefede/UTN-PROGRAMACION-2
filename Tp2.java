/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2;

import java.util.Scanner;

/**
 *
 * @author fede
 */
public class Tp2 {

    /**
     * @param args the command line arguments
     */
    // Variable global para el descuento especial
    public static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ACTIVIDAD 1:
        // Solicitar al usuario que ingrese un año
        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(input.nextLine());

        // Llamar a la función de verificación
        boolean resultado = esAnoBisiesto(anio);

        // Mostrar el resultado
        if (resultado) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 2:
        System.out.print("Ingrese el primer número: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el tercer número: ");
        int num3 = Integer.parseInt(input.nextLine());

        // Llamar a la función para obtener el mayor
        int mayor = numMayor(num1, num2, num3);

        // Mostrar el resultado
        System.out.println("El mayor es: " + mayor);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 3:
        // Solicitar la edad al usuario
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());

        // Obtener la clasificación llamando a la función
        String etapa = clasificarEdad(edad);

        // Mostrar el resultado
        System.out.println("Eres un " + etapa + ".");

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 4:
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = input.next().charAt(0);

        // Calcular precio final
        double precioFinal = calcularPrecioFinal(precio, categoria);
        String porcentajeDescuento = obtenerPorcentajeDescuento(categoria);

        // Mostrar resultados
        System.out.println("\nPrecio original: " + precio);
        System.out.println("Descuento aplicado: " + porcentajeDescuento);
        System.out.println("Precio final: " + precioFinal);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 5:
        int suma = 0;
        int numero;

        System.out.println("Suma de números pares (ingrese 0 para terminar)");

        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());

            if (numero == 0) {
                break; // Salir del ciclo cuando se ingresa 0
            }

            if (numero % 2 == 0) { // Verificar si el número es par
                suma += numero; // Sumar el número par
            }
        }

        System.out.println("La suma de los números pares es: " + suma);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 6:
        int positivos = 0, negativos = 0, ceros = 0;

        System.out.println("Ingrese 10 números enteros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = Integer.parseInt(input.nextLine());

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 7: 
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 8: 
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());

        // Calcular precio final llamando al método
        double precioUltimo = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar resultado formateado
        System.out.println("El precio final del producto es: " + precioUltimo);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 9: 
        // Solicitar datos al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();

        // Calcular costos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostrar resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 10: 
        // Solicitar datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());

        // Calcular nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 11: 
        // Solicitar el precio al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioUser = Double.parseDouble(input.nextLine());

        // Calcular y mostrar el descuento
        calcularDescuentoEspecial(precioUser);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 12: 
        // 1. Declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // 2. Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        // 3. Modificar el precio de un producto específico (tercer elemento, índice 2)
        precios[2] = 129.99;

        // 4. Mostrar precios modificados
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios);

        //------------------------------------------------------------
        //------------------------------------------------------------
        //------------------------------------------------------------
        // ACTIVIDAD 13: 
        double[] preciosDos = {199.99, 299.5, 149.75, 399.0, 89.99};

        // 2. Mostrar precios originales con función recursiva
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(preciosDos, 0);

        // 3. Modificar el precio de un producto específico (tercer elemento, índice 2)
        precios[2] = 129.99;

        // 4. Mostrar precios modificados con función recursiva
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(preciosDos, 0);

        input.close();
    }

    // Función para determinar si un año es bisiesto
    public static boolean esAnoBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 != 0) {
                return true;
            } else {
                if (anio % 400 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    // Función para determinar el mayor numero
    public static int numMayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    public static String clasificarEdad(int edad) {
        if (edad < 12) {
            return "Niño";
        }
        if (edad <= 17) {
            return "Adolescente";
        }
        if (edad <= 59) {
            return "Adulto";
        }
        return "Adulto mayor";
    }

    // Función para calcular el precio con descuento
    public static double calcularPrecioFinal(double precio, char categoria) {
        double descuento = 0;

        switch (categoria) {
            case 'A':
            case 'a':
                descuento = 0.10; // 10%
                break;
            case 'B':
            case 'b':
                descuento = 0.15; // 15%
                break;
            case 'C':
            case 'c':
                descuento = 0.20; // 20%
                break;
            default:
                System.out.println("Categoría no válida. No se aplicará descuento.");
                return precio;
        }

        return precio - (precio * descuento);
    }

    // Función para obtener el porcentaje de descuento como texto
    public static String obtenerPorcentajeDescuento(char categoria) {
        switch (categoria) {
            case 'A':
            case 'a':
                return "10%";
            case 'B':
            case 'b':
                return "15%";
            case 'C':
            case 'c':
                return "20%";
            default:
                return "0%";
        }
    }

    // Método para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertir porcentajes a decimales
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // Calcular precio final según la fórmula
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }

    // Función para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona no válida. Usando tarifa Nacional por defecto.");
            costoPorKg = 5.0;
        }

        return peso * costoPorKg;
    }

    // Función para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Método para calcular el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    // Método para calcular y mostrar el descuento
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para el descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // Método para mostrar los precios usando for-each
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.printf("Precio: $%.2f%n", precio);
        }
    }

    // Función recursiva para mostrar precios
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // Caso base: cuando llegamos al final del array
        if (indice >= precios.length) {
            return;
        }

        // Mostrar el precio actual
        System.out.printf("Precio: $%.2f%n", precios[indice]);

        // Llamada recursiva para el siguiente elemento
        mostrarPreciosRecursivo(precios, indice + 1);
    }
}
