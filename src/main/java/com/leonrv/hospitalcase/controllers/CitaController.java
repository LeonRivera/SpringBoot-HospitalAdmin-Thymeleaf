package com.leonrv.hospitalcase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.leonrv.hospitalcase.models.Cita;
import com.leonrv.hospitalcase.models.Consultorio;
import com.leonrv.hospitalcase.models.Doctor;
import com.leonrv.hospitalcase.services.ICitaService;
import com.leonrv.hospitalcase.services.IConsultorioService;
import com.leonrv.hospitalcase.services.IDoctorService;

@Controller
public class CitaController {
    
    @Autowired
    ICitaService citaService;

    @Autowired
    IConsultorioService consultorioService;

    @Autowired
    IDoctorService doctorService;

    @GetMapping("/")
    public String findAll(Model model){
        List<Cita> citas = citaService.findAll();
        model.addAttribute("citas", citas);
        System.out.println("Inyectando citas: ");

        citas.forEach(System.out::println);
        
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Cita cita, Model model){

        List<Doctor> doctores =  doctorService.findAll();
        List<Consultorio> consultorios = consultorioService.findAll();
        model.addAttribute("doctores", doctores );
        model.addAttribute("consultorios", consultorios );
        return "agregar";
    }

    @PostMapping("/guardar")
    public String guardar(Cita cita){


        System.out.println(cita.getConsultorio_id());
        System.out.println(cita.getDoctor_id());
        // System.out.println();
        citaService.save(cita);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(Cita cita, Model model){
        cita = citaService.findById(cita.getId());
        model.addAttribute("cita",cita );


        List<Doctor> doctores =  doctorService.findAll();
        List<Consultorio> consultorios = consultorioService.findAll();
        model.addAttribute("doctores", doctores );
        model.addAttribute("consultorios", consultorios );
        

        return "agregar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Cita cita){
        citaService.delete(cita);
        return "redirect:/";
    }
}
