/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.campeonato;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejecutable {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Torneo torneo = new Torneo();



        // Registrar equipos

        Equipo equipo1 = new Equipo("Equipo A", "Entrenador A");

        equipo1.agregarJugador(new Jugador("Jugador 1"));

        equipo1.agregarJugador(new Jugador("Jugador 2"));

        torneo.registrarEquipo(equipo1);


        Equipo equipo2 = new Equipo("Equipo B", "Entrenador B");

        equipo2.agregarJugador(new Jugador("Jugador 3"));

        equipo2.agregarJugador(new Jugador("Jugador 4"));

        torneo.registrarEquipo(equipo2);


        // Crear partido

        torneo.crearPartido(equipo1, equipo2, "2023-10-01");


        // Listar equipos

        System.out.println("Equipos registrados:");

        torneo.listarEquipos();


        // Mostrar historial de partidos

        System.out.println("\nHistorial de partidos:");

        torneo.mostrarHistorialPartidos();


        // Actualizar resultado

        Partido partido = torneo.partidos.get(0);
    }
}
