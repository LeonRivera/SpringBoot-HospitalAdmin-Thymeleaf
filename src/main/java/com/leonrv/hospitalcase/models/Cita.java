package com.leonrv.hospitalcase.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Null;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Data
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreDelPaciente;

    // @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date horarioConsulta;

    @Column(name = "consultorio_id")
    public Long consultorio_id;

    @Column(name = "doctor_id")
    public Long doctor_id;
    
    @ManyToOne
    @JoinColumn(updatable = false, insertable = false)
    Consultorio consultorio;

    @ManyToOne
    @JoinColumn(updatable = false, insertable = false)
    Doctor doctor;
}
