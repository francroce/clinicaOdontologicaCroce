package com.example.clinicaOdontologicaCroce.repository;

import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;
import com.example.clinicaOdontologicaCroce.entity.Paciente;
import com.example.clinicaOdontologicaCroce.entity.PacienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente,Long> {

    @Query("SELECT p from Paciente p WHERE p.dni LIKE :dni")
    PacienteDTO obtenerPacientePorDni(@Param("dni") int dni);

}
