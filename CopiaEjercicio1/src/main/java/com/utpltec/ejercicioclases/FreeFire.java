/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.ejercicioclases;

/**
 *
 * @author Usuario
 */
public class FreeFire extends JuegoOnline{
  //atributos de la clase
    public String TipodeArma;
    public String Rango;

    public String getTipodeArma() {
        return TipodeArma;
    }

    public void setTipodeArma(String TipodeArma) {
        this.TipodeArma = TipodeArma;
    }

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    
    }
//Herencia por clase normal o simple
    {   
    FreeFire ff = new FreeFire ();
            ff.getNombre1(); 
       System.out.println ("Mostrar nombre del jugador" + ff.getNombre1()+ 
               "Mostrar plataforma" + getPlataforma()+ 
               "Mostrar Almacenamiento"+ getAlmacenamiento()+
               "Mostrar tipo de arma" + TipodeArma +
               "Mostrar Rango" + Rango );
       
}
}
