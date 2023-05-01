package com.example.clinicaOdontologicaCroce.service.impl;

import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;
import com.example.clinicaOdontologicaCroce.exceptions.BadRequestException;
import com.example.clinicaOdontologicaCroce.service.IOdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class OdontologoServiceTest {
    @Autowired
    IOdontologoService iOdontologoService;

    @Test
    public void crearOdontologo() throws BadRequestException {
        OdontologoDTO odontologoDTO= new OdontologoDTO();
        odontologoDTO.setNombre("Juan");
        odontologoDTO.setApellido("Fernando");
        odontologoDTO.setMatricula(54353);
        iOdontologoService.crearOdontologo(odontologoDTO);

        assertTrue(odontologoDTO != null);

    }

}