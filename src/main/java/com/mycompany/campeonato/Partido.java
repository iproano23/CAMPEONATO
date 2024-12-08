
package com.mycompany.campeonato;

public class Partido {
    private Equipo equipo1;

    private Equipo equipo2;

    private String fecha;

    private String resultado;

    private boolean finalizado;


    public Partido(Equipo equipo1, Equipo equipo2, String fecha) {

        this.equipo1 = equipo1;

        this.equipo2 = equipo2;

        this.fecha = fecha;

        this.resultado = "Pendiente";

        this.finalizado = false;

    }


    public void finalizarPartido(String resultado) {

        this.resultado = resultado;

        this.finalizado = true;

    }


    public boolean isFinalizado() {

        return finalizado;

    }


    public String getResultado() {

        return resultado;

    }


    public Equipo getEquipo1() {

        return equipo1;

    }


    public Equipo getEquipo2() {

        return equipo2;

    }


    public String getFecha() {

        return fecha;

    }
}
