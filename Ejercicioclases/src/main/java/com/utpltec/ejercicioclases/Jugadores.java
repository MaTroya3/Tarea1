package com.utpltec.ejercicioclases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Jugadores {
        //atributos de la clase
    private String Nombre;
    private String Apellido;
    private int Edad;
    
    //Constructores 
    public Jugadores(){
    }
    public Jugadores(String Nombre, String  Apellido, int Edad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad= Edad;
    }
//Métodos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    


    
}
