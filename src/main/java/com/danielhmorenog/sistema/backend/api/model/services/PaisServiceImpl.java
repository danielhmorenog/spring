/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielhmorenog.sistema.backend.api.model.services;

import com.danielhmorenog.sistema.backend.api.model.dao.IPaisDao;
import com.danielhmorenog.sistema.backend.api.model.entities.Pais;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author danie
 */
@Service
public class PaisServiceImpl implements IPaisService {

    @Autowired
    private IPaisDao paisDao;

    @Transactional(readOnly = true)
    @Override
    public List<Pais> findall() {
        return (List<Pais>) paisDao.findAll();
    }
}
