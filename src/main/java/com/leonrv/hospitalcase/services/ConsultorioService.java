package com.leonrv.hospitalcase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonrv.hospitalcase.models.Consultorio;
import com.leonrv.hospitalcase.repositories.ConsultorioRepository;

@Service
public class ConsultorioService implements IConsultorioService{
    @Autowired
    ConsultorioRepository consultorioRepository;

    @Override
    public List<Consultorio> findAll() {
        return (List<Consultorio>) consultorioRepository.findAll();
    }

    @Override
    public void save(Consultorio consultorio) {
        consultorioRepository.save(consultorio);
    }

    @Override
    public void delete(Consultorio consultorio) {
        consultorioRepository.delete(consultorio);
    }

    @Override
    public Consultorio findById(Long id) {
        return consultorioRepository.findById(id).orElse(null);
    }
}
