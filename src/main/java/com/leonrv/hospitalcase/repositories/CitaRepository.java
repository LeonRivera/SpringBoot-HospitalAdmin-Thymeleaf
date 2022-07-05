package com.leonrv.hospitalcase.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leonrv.hospitalcase.models.Cita;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Long>{}
