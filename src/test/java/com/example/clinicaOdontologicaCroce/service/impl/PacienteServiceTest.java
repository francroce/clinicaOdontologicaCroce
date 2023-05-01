package com.example.clinicaOdontologicaCroce.service.impl;

import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;
import com.example.clinicaOdontologicaCroce.entity.PacienteDTO;
import com.example.clinicaOdontologicaCroce.exceptions.BadRequestException;
import com.example.clinicaOdontologicaCroce.service.IOdontologoService;
import com.example.clinicaOdontologicaCroce.service.IPacienteService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PacienteServiceTest {

    @Autowired
    IPacienteService pacienteService;

    @Test
    public void eliminarPaciente() throws BadRequestException {
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setId(99L);
        pacienteDTO.setNombre("Franco");
        pacienteDTO.setApellido("Croce");
        pacienteDTO.setDni(77777);
        pacienteDTO.setEmail("francoCrocee@gmail.com");
        pacienteDTO.setFechaDeIngreso(new Date());
        pacienteDTO.setDomicilio(null);
        pacienteService.crearPaciente(pacienteDTO);

        PacienteDTO pacienteFranco = pacienteService.leerPaciente(99L);

        pacienteService.eliminarPaciente(99L);

        assertNull(pacienteFranco);
    }
}