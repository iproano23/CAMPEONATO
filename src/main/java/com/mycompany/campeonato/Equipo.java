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
public class Equipo {
    private String nombre;

    private String entrenador;

    private List<Jugador> jugadores;


    public Equipo(String nombre, String entrenador) {

        this.nombre = nombre;

        this.entrenador = entrenador;

        this.jugadores = new ArrayList<>();

    }


    public void agregarJugador(Jugador jugador) {

        jugadores.add(jugador);

    }


    public String getNombre() {

        return nombre;

    }


    public String getEntrenador() {

        return entrenador;

    }


    public List<Jugador> getJugadores() {

        return jugadores;

    }
}
