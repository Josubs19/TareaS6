package com.practica01.g3.controller;

import com.practica01.g3.domain.Pais;
import com.practica01.g3.service.PaisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/")
    public String inicio(Model model){
        var pais=paisService.getPais();
        model.addAttribute("pais", pais);   
        return "index";
    }
    
    @GetMapping("/pais/nuevo")
    public String paisNuevo(Model model,Pais pais){  
        return "modificaPais";
    }
    
    @PostMapping("/pais/guardar")
    public String paisGuardar(Pais pais){
        paisService.save(pais);
        return "redirect:/";
    }
    
    @GetMapping("/pais/eliminar/{idPais}")
    public String paisEliminar(Pais pais){
        paisService.delete(pais);
        return "redirect:/";
    }
    
    @GetMapping("/pais/modificar/{idPais}")
    public String paisModificar(Pais pais, Model model){
        pais=paisService.getPais(pais);
        model.addAttribute("pais", pais);
        return "modificaPais";
    }
    
}
