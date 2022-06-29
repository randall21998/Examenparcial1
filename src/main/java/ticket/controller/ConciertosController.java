/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket.controller;

import com.ticket.entity.Concierto;
import com.ticket.service.IConciertoService;
import com.tienda.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Randall
 */
@Controller
public class ConciertosController {
    @Autowired
    private IConciertoService conciertosService;
    
    @GetMapping("/concierto")
    public String index(Model model){
        List<Conciertos> listaConciertos = conciertosService.getAllconcierto();
        model.addAttribute("titulo","Tabla Conciertos");
        Object listaconciertos = null;
        model.addAttribute("personas",listaconciertos);
        return "conciertos";
    }
}
