/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.Sala;
import java.util.List;

/**
 *
 * @author andre
 */
public interface ISalaService {
    public List<Sala> getAllSala();
    public Sala getSalaById (long id);
    public void saveSala (Sala sala);
    public void delete (long id);
}
