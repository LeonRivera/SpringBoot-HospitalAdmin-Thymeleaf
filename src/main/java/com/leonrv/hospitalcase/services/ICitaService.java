package com.leonrv.hospitalcase.services;

import java.util.List;

import com.leonrv.hospitalcase.models.Cita;


public interface ICitaService {
    List<Cita> findAll();
    void save(Cita cita);
    void delete(Cita cita);
    Cita findById(Long id);
}
