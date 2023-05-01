package com.example.clinicaOdontologicaCroce.repository;

import com.example.clinicaOdontologicaCroce.entity.Domicilio;
import com.example.clinicaOdontologicaCroce.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDomicilioRepository extends JpaRepository<Domicilio,Long> {
}
