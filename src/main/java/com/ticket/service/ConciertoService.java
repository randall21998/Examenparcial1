/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.service;

import com.ticket.repository.ConciertoRepository;
import com.tienda.entity.Conciertos;
import com.tienda.repository.conciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Randall
 */

@Service
public class ConciertoService implements IConciertoService{
    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Conciertos> getAllPersona() {
       return(List<Conciertos>)conciertoRepository.findAll(); 
    }

    @Override
    public Conciertos getConciertosById(long idConciertos) {
        return conciertoRepository.findOne(idConciertos);
    }

    @Override
    public void savePersona(Conciertos conciertos) {
       conciertoRepository.save(conciertos);
    }

    @Override
    public void delete(long idConciertos) {
        conciertoRepository.delete(idConciertos);
    }
   

    
    
}
