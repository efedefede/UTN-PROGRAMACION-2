/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg5.uml;

import computadora_placamadre_propietario.Computadora;
import computadora_placamadre_propietario.Propietario;
import tp.pkg5.uml.celular_bateria_usuario.Bateria;
import tp.pkg5.uml.celular_bateria_usuario.Celular;
import tp.pkg5.uml.celular_bateria_usuario.Usuario;
import tp.pkg5.uml.citaMedica_paciente_profesional.CitaMedica;
import tp.pkg5.uml.citaMedica_paciente_profesional.Paciente;
import tp.pkg5.uml.citaMedica_paciente_profesional.Profesional;
import tp.pkg5.uml.cuentaBancaria_claveSeguridad_titular.CuentaBancaria;
import tp.pkg5.uml.cuentaBancaria_claveSeguridad_titular.TitularCuenta;
import tp.pkg5.uml.documento_firmaDigital_usuario.Documento;
import tp.pkg5.uml.documento_firmaDigital_usuario.UsuarioDoc;
import tp.pkg5.uml.editorVideo_proyecto_render.EditorVideo;
import tp.pkg5.uml.editorVideo_proyecto_render.Proyecto;
import tp.pkg5.uml.generadorQR_usuarioQR_codigoQR.GeneradorQR;
import tp.pkg5.uml.generadorQR_usuarioQR_codigoQR.UsuarioQR;
import tp.pkg5.uml.impuesto_contribuyente_calculadora.Calculadora;
import tp.pkg5.uml.impuesto_contribuyente_calculadora.Contribuyente;
import tp.pkg5.uml.impuesto_contribuyente_calculadora.Impuesto;
import tp.pkg5.uml.libro_autor_editorial.Autor;
import tp.pkg5.uml.libro_autor_editorial.Editorial;
import tp.pkg5.uml.libro_autor_editorial.Libro;
import tp.pkg5.uml.pasaporte_foto_titular.folder.Pasaporte;
import tp.pkg5.uml.pasaporte_foto_titular.folder.Titular;
import tp.pkg5.uml.reproductor_cancion_artista.Artista;
import tp.pkg5.uml.reproductor_cancion_artista.Cancion;
import tp.pkg5.uml.reproductor_cancion_artista.Reproductor;
import tp.pkg5.uml.reserva_mesa_cliente.ClienteResto;
import tp.pkg5.uml.reserva_mesa_cliente.Mesa;
import tp.pkg5.uml.reserva_mesa_cliente.Reserva;
import tp.pkg5.uml.tarjeta_cliente_banco.Banco;
import tp.pkg5.uml.tarjeta_cliente_banco.Cliente;
import tp.pkg5.uml.tarjeta_cliente_banco.TarjetaDeCredito;
import tp.pkg5.uml.vehiculo_motor_conductor.Conductor;
import tp.pkg5.uml.vehiculo_motor_conductor.Motor;
import tp.pkg5.uml.vehiculo_motor_conductor.Vehiculo;

/**
 *
 * @author fede
 */
public class Tp5Uml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Punto 1 Pasaporte, Foto, Titular:
        Pasaporte pa = new Pasaporte(100, "22/10/2022", "foto", "JPG");
        Titular tit = new Titular("Fede Panella", "35263889");
        
        pa.setTitular(tit);
        
        System.out.println("Foto del pasaporte: " + pa.getFoto().toString());
        System.out.println("Titular del pasaporte: " + pa.getTitular().toString());
        System.out.println("Pasaporte del titular: " + tit.getPasaporte().toString());

        // Punto 2 Celular, Bateria, Usuario:
        Bateria bat = new Bateria("modelo 1", "7 horas");
        Celular cel = new Celular("1122lldkk", "Samsung", "galaxy", bat);
        Usuario user = new Usuario("Fede Panella", "35263889");
        
        user.setCelular(cel);
        
        System.out.println("Celular del usuario: " + user.getCelular());
        System.out.println("Usuario del celular: " + cel.getUsuario());
        System.out.println("Bateria del celular: " + cel.getBateria());

        // Punto 3 Libro, Autor, Editorial:
        Editorial edi = new Editorial("Edi", "calle false 123");
        Libro li = new Libro("Libro 1", "aabbccdd", edi);
        Autor aut = new Autor("Fede Panella", "Argentina");
        
        li.setAutor(aut);
        
        System.out.println("Editorial del libro: " + li.getEditorial().toString());
        System.out.println("Autor del libro: " + li.getEditorial().toString());

        // Punto 4 TarjetaDeCredito, Cliente, Banco
        Banco ban = new Banco("ban-1", "112233");
        TarjetaDeCredito tj = new TarjetaDeCredito("334455", "22/10/2030", ban);
        Cliente cl = new Cliente("Fede Panella", "35263889");
        
        cl.setTarjeta(tj);
        
        System.out.println("Banco de la tarjeta: " + tj.getBanco());
        System.out.println("Cliente de la tarjeta: " + tj.getCliente());
        System.out.println("Tarjeta del cliente: " + cl.getTarjeta());

        // Punto 5 Computadora, PlacaMadre, Propietario
        Computadora compu = new Computadora("Lenovo", "7788", "Bot66", "M3");
        Propietario prop = new Propietario("Fede Panella", "35263889");
        
        compu.setPropietario(prop);
        
        System.out.println("Placa de la compu: " + compu.getPlaca().toString());
        System.out.println("Propietario de la compu: " + compu.getPropietario());
        System.out.println("Compu del propietario " + prop.getComputadora());

        // Punto 6 Reserva, Cliente, Mesa
        Mesa mesa = new Mesa(1001, 4);
        Reserva reserva = new Reserva("22/10", "22:00", mesa);
        ClienteResto cliente = new ClienteResto("Fede Panella", "222222222");
        
        reserva.setCliente(cliente);
        
        System.out.println("Mesa de la reserva: " + reserva.getMesa().toString());
        System.out.println("Cliente de la reserva: " + reserva.getCliente().toString());

        // Punto 7 Vehiculo, Motor, Conductor
        Motor motor = new Motor("1.6", "1122");
        Vehiculo golcito = new Vehiculo("its-601", "Gol", motor);
        
        Conductor conductor = new Conductor("Fede", "334455");
        
        golcito.setConductor(conductor);
        
        System.out.println("Motor del gol: " + golcito.getMotor().toString());
        System.out.println("Conductor del gol: " + golcito.getConductor().toString());
        System.out.println("Vehiculo de Fede: " + conductor.getVehiculo().toString());

        // Punto 8 Documento, FirmaDigital, Usuario
        UsuarioDoc userDoc = new UsuarioDoc("Fede", "mimail@mail.com");
        Documento doc = new Documento("Docu", "Mento", "112H334D", "22/10/2210", userDoc);
        
        System.out.println("Documento: " + doc.toString());
        System.out.println("Firma del documento: " + doc.getFirma().toString());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().toString());

        // Punto 9 CitaMedica, Paciente, Profesional
        CitaMedica cita = new CitaMedica("22/10", "10:22");
        Paciente paciente = new Paciente("Fede", "osde");
        Profesional profesional = new Profesional("Rico", "clinico");
        
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        System.out.println("Datos de la cita medica: " + cita.toString());

        // Punto 10 CuentaBancaria, ClaveSeguridad, Titular
        CuentaBancaria cuenta = new CuentaBancaria("22k10vvlloo", 1000000.0, "contrasenia123", "22/10");
        TitularCuenta titular = new TitularCuenta("Fede", "35263889");
        cuenta.setTitular(titular);
        
        System.out.println("Datos de la cuenta: " + cuenta.toString());

        // ---> DEPENDENCIA DE USO <---
        // Punto 11 Reproductor, Cancion, Artista
        Reproductor rep = new Reproductor();
        Artista artista = new Artista("KB", "Rap");
        Cancion cancion = new Cancion("precalentando", artista);
        
        rep.reproducir(cancion);

        // Punto 12 Impuesto, Contribuyente, Calculadora
        Contribuyente cont = new Contribuyente("Fede", "33334444555");
        Impuesto imp = new Impuesto(10.0, cont);
        Calculadora calc = new Calculadora();
        
        calc.calcular(imp);

        // ---> DEPENDENCIA DE CREACION <---
        // Punto 13 GeneradorQR, Usuario, CodigoQR
        UsuarioQR userQR = new UsuarioQR("FedeQR", "fede@mail.com");
        GeneradorQR gen = new GeneradorQR();
        
        gen.generar("value", userQR);

        // Punto 14 EditorVideo, Proyecto, Render
        Proyecto pro = new Proyecto("pro-1", "10");
        EditorVideo ed = new EditorVideo();
        
        ed.exportar(".WAV", pro);
    }
    
}
