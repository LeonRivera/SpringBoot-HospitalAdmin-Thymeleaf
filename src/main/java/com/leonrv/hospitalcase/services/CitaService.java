package com.leonrv.hospitalcase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonrv.hospitalcase.models.Cita;
import com.leonrv.hospitalcase.repositories.CitaRepository;

@Service
public class CitaService implements ICitaService{

    @Autowired
    CitaRepository citaRepository;

    @Override
    public List<Cita> findAll() {
        return (List<Cita>) citaRepository.findAll();
    }

    @Override
    public void save(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void delete(Cita cita) {
        citaRepository.delete(cita);
    }

    @Override
    public Cita findById(Long id) {
        return citaRepository.findById(id).orElse(null);
    }

   
    
}
