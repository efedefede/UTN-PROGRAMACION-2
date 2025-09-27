/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg6.colections;

import java.util.List;

/**
 *
 * @author fede
 */
public class Tp6Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PARTE 1: Sistema de Stock (Productos e Inventario)" + "\n" + "=".repeat(50));
        // Crear inventario
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos
        Producto p1 = new Producto("P001", "Arroz", 500, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone", 2500, 50, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa", 1200, 75, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén", 800, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Laptop", 4500, 20, CategoriaProducto.ELECTRONICA);

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("\n" + "=".repeat(50));

        // 2. Listar todos los productos
        inventario.listarProductos();

        System.out.println("\n" + "=".repeat(50));

        // 3. Buscar producto por ID
        System.out.println("BUSCAR PRODUCTO POR ID:");
        Producto encontrado = inventario.buscarProductoPorId("P002");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        System.out.println("\n" + "=".repeat(50));

        // 4. Filtrar por categoría
        System.out.println("PRODUCTOS DE ELECTRÓNICA:");
        List<Producto> electronicos = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronicos) {
            p.mostrarInfo();
        }

        System.out.println("\n" + "=".repeat(50));

        // 5. Eliminar producto y listar restantes
        System.out.println("ELIMINAR PRODUCTO P004:");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        System.out.println("\n" + "=".repeat(50));

        // 6. Actualizar stock
        inventario.actualizarStock("P001", 150);

        System.out.println("\n" + "=".repeat(50));

        // 7. Mostrar total de stock
        System.out.println("TOTAL DE STOCK: " + inventario.obtenerTotalStock());

        System.out.println("\n" + "=".repeat(50));

        // 8. Producto con mayor stock
        System.out.println("PRODUCTO CON MAYOR STOCK:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        System.out.println("\n" + "=".repeat(50));

        // 9. Filtrar por precio ($1000 - $3000)
        System.out.println("PRODUCTOS ENTRE $1000 Y $3000:");
        List<Producto> porPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : porPrecio) {
            p.mostrarInfo();
        }

        System.out.println("\n" + "=".repeat(50));

        // 10. Mostrar categorías disponibles
        inventario.mostrarCategoriasDisponibles();
        System.out.println("\n" + "=".repeat(50));

        System.out.println("PARTE 2: Sistema de Biblioteca" + "\n" + "=".repeat(50));

        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Jorge Luis Borges", "Argentina");

        // 3. Agregar 5 libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("ISBN004", "Ficciones", 1944, autor3);
        biblioteca.agregarLibro("ISBN005", "El aleph", 1949, autor3);

        // 4. Listar todos los libros
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("\nBUSCAR LIBRO POR ISBN:");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        }

        // 6. Filtrar por año
        System.out.println("\nLIBROS DEL AÑO 1944:");
        List<Libro> libros1944 = biblioteca.filtrarLibrosPorAnio(1944);
        for (Libro libro : libros1944) {
            libro.mostrarInfo();
        }

        // 7. Eliminar libro
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8. Cantidad total de libros
        System.out.println("\nCANTIDAD TOTAL DE LIBROS: " + biblioteca.obtenerCantidadLibros());

        // 9. Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();

        System.out.println("\n" + "=".repeat(50));

        System.out.println("PARTE 3: Sistema Universidad (Relación Bidireccional)" + "\n" + "=".repeat(50));

        // Crear universidad
        Universidad universidad = new Universidad("Universidad Nacional");

        // 1. Crear 3 profesores y 5 cursos
        Profesor prof1 = new Profesor("P001", "Dr. García", "Matemáticas");
        Profesor prof2 = new Profesor("P002", "Dra. Martínez", "Física");
        Profesor prof3 = new Profesor("P003", "Dr. López", "Programación");

        Curso curso1 = new Curso("C001", "Cálculo I");
        Curso curso2 = new Curso("C002", "Física I");
        Curso curso3 = new Curso("C003", "Programación I");
        Curso curso4 = new Curso("C004", "Álgebra Lineal");
        Curso curso5 = new Curso("C005", "Estructuras de Datos");

        // 2. Agregar a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // 3. Asignar profesores a cursos
        universidad.asignarProfesorACurso("C001", "P001"); // García -> Cálculo
        universidad.asignarProfesorACurso("C002", "P002"); // Martínez -> Física
        universidad.asignarProfesorACurso("C003", "P003"); // López -> Programación
        universidad.asignarProfesorACurso("C004", "P001"); // García -> Álgebra
        universidad.asignarProfesorACurso("C005", "P003"); // López -> Estructuras

        // 4. Listar cursos y profesores
        universidad.listarCursos();
        universidad.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("\n=== CAMBIAR PROFESOR DE CÁLCULO I ===");
        universidad.asignarProfesorACurso("C001", "P002"); // Martínez -> Cálculo
        universidad.listarCursos();
        universidad.listarProfesores();

        // 6. Remover un curso
        System.out.println("\n=== ELIMINAR CURSO FÍSICA I ===");
        universidad.eliminarCurso("C002");
        universidad.listarCursos();
        universidad.listarProfesores();

        // 7. Remover un profesor
        System.out.println("\n=== ELIMINAR PROFESOR LÓPEZ ===");
        universidad.eliminarProfesor("P003");
        universidad.listarCursos();
        universidad.listarProfesores();

        // 8. Reporte final
        universidad.mostrarReporteCursosPorProfesor();
    }

}
