package com.example.clinicaOdontologicaCroce.repository;

import com.example.clinicaOdontologicaCroce.entity.Odontologo;
import com.example.clinicaOdontologicaCroce.entity.OdontologoDTO;
import com.example.clinicaOdontologicaCroce.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo,Long> {

   @Query("SELECT e from Odontologo e WHERE e.matricula LIKE :matricula")
   OdontologoDTO obtenerOdontologosPorMatricula(@Param("matricula") int matricula);

}
