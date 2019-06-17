package com.pf.busqueda.service;

import com.pf.busqueda.model.Avion;
import com.pf.busqueda.repository.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvionService {

    @Autowired
    private AvionRepository avionRepository;

    public Iterable<Avion> findAll(){
        return avionRepository.findAll();
    }

    public Optional<Avion> findById(Integer id) {
        return avionRepository.findById(id);
    }
}
