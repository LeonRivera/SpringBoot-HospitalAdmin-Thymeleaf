INSERT INTO doctor (nombre, apellido_materno, apellido_paterno, especialidad) VALUES 
('Leon Felipe','Rivera','Rivera', 'Odontologia'),
('Jose','Angel','Franco', 'Psicologia'),
('Jesus','Perez','Cruz', 'Otorrinolaringologia'),
('Martin','Dominguez','Ruiz', 'XD'),
('Andres','Torres','Hernandez', 'Anestesiologia');



INSERT INTO consultorio (numero_consultorio, piso) VALUES
(3,'1'),
(2,'2'),
(1,'3'),
(2,'4'),
(4,'5');

INSERT INTO cita (nombre_del_paciente, consultorio_id, doctor_id) VALUES
('Jesus nieto', 1, 1);