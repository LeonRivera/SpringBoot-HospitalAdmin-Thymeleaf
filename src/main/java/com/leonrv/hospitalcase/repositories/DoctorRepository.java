package com.leonrv.hospitalcase.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leonrv.hospitalcase.models.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long>{}
