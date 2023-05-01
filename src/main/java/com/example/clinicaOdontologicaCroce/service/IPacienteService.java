package com.example.clinicaOdontologicaCroce.service;

import com.example.clinicaOdontologicaCroce.entity.DomicilioDTO;
import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;
import com.example.clinicaOdontologicaCroce.entity.PacienteDTO;
import com.example.clinicaOdontologicaCroce.exceptions.BadRequestException;

import java.util.Set;

public interface IPacienteService {

    void crearPaciente(PacienteDTO pacienteDTO) throws BadRequestException;
    PacienteDTO leerPaciente(Long id);
    void modificarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Long id);
    Set<PacienteDTO> traerTodos();

}
