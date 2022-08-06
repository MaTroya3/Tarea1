package com.utpltec.ejercicioclases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Puntaje {
 
    //atributos de la clase
    public String NombresJugadores;
    public int NúmeroParticipantes;
    public int Marcador;
    
    //Constructores 
    public Puntaje(){
    }
    public Puntaje(String NombresJugadores, int NúmeroParticipantes, int Marcador){
        this.NombresJugadores = NombresJugadores;
        this.NúmeroParticipantes = NúmeroParticipantes;
        this.Marcador= Marcador;
    }

    public String getNombresJugadores() {
        return NombresJugadores;
    }

    public void setNombresJugadores(String NombresJugadores) {
        this.NombresJugadores = NombresJugadores;
    }

    public int getNúmeroParticipantes() {
        return NúmeroParticipantes;
    }

    public void setNúmeroParticipantes(int NúmeroParticipantes) {
        this.NúmeroParticipantes = NúmeroParticipantes;
    }

    public int getMarcador() {
        return Marcador;
    }

    public void setMarcador(int Marcador) {
        this.Marcador = Marcador;
    }

}
