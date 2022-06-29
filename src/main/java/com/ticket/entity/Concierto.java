/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Randall
 */
@Entity
@Table(name="conciertos")
public class Concierto implements Serializable{
    private long idConciertos;
    private String Concierto;
    private String artista;
    int valorEntrada;
   int fecha;
   int capMax;
     private String lugar;
    
@Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name="paises_id")

    public long getIdConciertos() {
        return idConciertos;
    }

    public void setIdConciertos(long idConciertos) {
        this.idConciertos = idConciertos;
    }

    public String getConcierto() {
        return Concierto;
    }

    public void setConcierto(String Concierto) {
        this.Concierto = Concierto;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(int valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    

   
}
