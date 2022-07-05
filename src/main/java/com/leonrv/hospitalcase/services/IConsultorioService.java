package com.leonrv.hospitalcase.services;

import java.util.List;

import com.leonrv.hospitalcase.models.Consultorio;

public interface IConsultorioService {
    List<Consultorio> findAll();
    void save(Consultorio consultorio);
    void delete(Consultorio consultorio);
    Consultorio findById(Long id);
}
