package com.leonrv.hospitalcase.services;

import java.util.List;

import com.leonrv.hospitalcase.models.Doctor;

public interface IDoctorService {
    List<Doctor> findAll();
    void save(Doctor doctor);
    void delete(Doctor doctor);
    Doctor findById(Long id);
}
