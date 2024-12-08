/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.campeonato;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Torneo {
    private List<Equipo> equipos;

    List<Partido> partidos;


    public Torneo() {

        equipos = new ArrayList<>();

        partidos = new ArrayList<>();

    }


    public void registrarEquipo(Equipo equipo) {

        equipos.add(equipo);

    }


    public void crearPartido(Equipo equipo1, Equipo equipo2, String fecha) {

        partidos.add(new Partido(equipo1, equipo2, fecha));

    }


    public void listarEquipos() {

        for (Equipo equipo : equipos) {

            System.out.println("Equipo: " + equipo.getNombre() + ", Entrenador: " + equipo.getEntrenador());

            System.out.print("Jugadores: ");

            for (Jugador jugador : equipo.getJugadores()) {

                System.out.print(jugador.getNombre() + " ");

            }

            System.out.println();

        }

    }


    public void mostrarHistorialPartidos() {

        for (Partido partido : partidos) {

            String estado = partido.isFinalizado() ? "Finalizado" : "Pendiente";

            System.out.println("Partido: " + partido.getEquipo1().getNombre() + " vs " + partido.getEquipo2().getNombre() +

                    " | Fecha: " + partido.getFecha() + " | Resultado: " + partido.getResultado() + " | Estado: " + estado);

        }

    }


    public void actualizarResultado(Partido partido, String resultado) {

        if (!partido.isFinalizado()) {

            partido.finalizarPartido(resultado);

        } else {

            System.out.println("El partido ya está finalizado.");

        }

    }
}
