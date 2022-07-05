package com.leonrv.hospitalcase.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leonrv.hospitalcase.models.Consultorio;

@Repository
public interface ConsultorioRepository extends CrudRepository<Consultorio, Long>{
}
