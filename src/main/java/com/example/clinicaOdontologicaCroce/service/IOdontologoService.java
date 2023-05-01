package com.example.clinicaOdontologicaCroce.service;

import com.example.clinicaOdontologicaCroce.entity.Odontologo;
import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;
import com.example.clinicaOdontologicaCroce.exceptions.BadRequestException;

import java.util.Set;

public interface IOdontologoService {

    void crearOdontologo(OdontologoDTO odontologoDTO) throws BadRequestException;
    OdontologoDTO leerOdontologo(Long id);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Long id);
    Set<OdontologoDTO> traerTodos();


}
