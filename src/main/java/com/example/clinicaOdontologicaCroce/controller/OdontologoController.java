package com.example.clinicaOdontologicaCroce.controller;

import com.example.clinicaOdontologicaCroce.GlobalExceptionHandler;
import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;
import com.example.clinicaOdontologicaCroce.exceptions.BadRequestException;
import com.example.clinicaOdontologicaCroce.repository.IOdontologoRepository;
import com.example.clinicaOdontologicaCroce.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController @CrossOrigin
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping("/registrar")
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO) throws BadRequestException {
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")

    public OdontologoDTO buscarOdontologoId(@PathVariable Long id){
        return odontologoService.leerOdontologo(id);
    }

    @PutMapping("/modificar")
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Set<OdontologoDTO> traerTodos(){
        return odontologoService.traerTodos();
    }

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<String> procesarErrorBadRequest(BadRequestException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

}