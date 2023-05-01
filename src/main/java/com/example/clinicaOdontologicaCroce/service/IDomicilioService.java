package com.example.clinicaOdontologicaCroce.service;

import com.example.clinicaOdontologicaCroce.entity.DomicilioDTO;
import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;

import java.util.Set;

public interface IDomicilioService {

    DomicilioDTO crearDomicilio(DomicilioDTO domicilioDTO);
    DomicilioDTO leerDomicilio(Long id);
    void modificarDomicilio(DomicilioDTO domicilioDTO);
    void eliminarDomicilio(Long id);
    Set<DomicilioDTO> traerTodos();

}
