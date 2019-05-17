/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielhmorenog.sistema.backend.api.model.dao;

import com.danielhmorenog.sistema.backend.api.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author danie
 */
public interface IPaisDao extends CrudRepository<Pais,Integer>{
    
}
