/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.Sala;
import com.cinelitas.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class SalaService implements ISalaService {
    @Autowired
    private SalaRepository salaRepository;
    
    @Override
    public List<Sala> getAllSala() {
        return (List<Sala>) salaRepository.findAll();
    }
    
    @Override
    public Sala getSalaById(long id) {
        return salaRepository.findById(id).orElse(null);
    }
    
    @Override
    public void saveSala (Sala sala) {
        salaRepository.save(sala);
    }

    @Override
    public void delete(long id) {
        salaRepository.deleteById(id);
    }
            
}
