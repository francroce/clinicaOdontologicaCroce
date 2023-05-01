package com.example.clinicaOdontologicaCroce.repository;

import com.example.clinicaOdontologicaCroce.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno,Long> {
}
