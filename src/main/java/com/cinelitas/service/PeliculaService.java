/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.Pelicula;
import com.cinelitas.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class PeliculaService implements IPeliculaService{
    
    @Autowired
    private PeliculaRepository PeliculaRepository;

    @Override
    public List<Pelicula> listMovie() {
        return (List <Pelicula>)PeliculaRepository.findAll();
    }
    
}
