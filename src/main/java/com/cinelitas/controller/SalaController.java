/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.cinelitas.controller;

import com.cinelitas.entity.Pelicula;
import com.cinelitas.entity.Sala;
import com.cinelitas.service.IPeliculaService;
import com.cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author andre
 */
@Controller
public class SalaController {
    
    @Autowired
    private ISalaService salaService;
    
    @Autowired
    private IPeliculaService peliculaService;
    
        @GetMapping ("/sala")
    public String index (Model model) {
        List<Sala> listaSala = salaService.getAllSala();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("salas", listaSala);
        return "salas";
    }
    
    @GetMapping ("salaN")
    public String crearSala (Model model) {
        List<Pelicula> listaPeliculas = peliculaService.listMovie();
        model.addAttribute("sala", new Sala());
        model.addAttribute("peliculas", listaPeliculas);
        return "crear";
    }
    
}
