package com.example.clinicaOdontologicaCroce.service;

import com.example.clinicaOdontologicaCroce.entity.DomicilioDTO;
import com.example.clinicaOdontologicaCroce.entity.TurnoDTO;

import java.util.Set;

public interface ITurnoService {

    void crearTurno(TurnoDTO turnoDTO);
    TurnoDTO leerTurno(Long id);
    void modificarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Long id);
    Set<TurnoDTO> traerTodos();

}
