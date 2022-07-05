package com.leonrv.hospitalcase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonrv.hospitalcase.models.Doctor;
import com.leonrv.hospitalcase.repositories.DoctorRepository;

@Service
public class DoctorService implements IDoctorService{
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<Doctor> findAll() {
        return (List<Doctor>) doctorRepository.findAll();
    }

    @Override
    public void save(Doctor Doctor) {
        doctorRepository.save(Doctor);
    }

    @Override
    public void delete(Doctor Doctor) {
        doctorRepository.delete(Doctor);
    }

    @Override
    public Doctor findById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }
}
