/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.service;

import com.ticket.entity.Conciertos;
import com.tienda.entity.Conciertos;
import java.util.List;

/**
 *
 * @author Randall
 */
public interface IConciertoService {

    public List<Conciertos> getAllPersona();

    

    public Conciertos getPersonaById(long idConciertos);

    public void savePersona(Conciertos conciertos);

    public void delete(long idConciertos);

    public List<Conciertos> getAllconcierto();

   

}
