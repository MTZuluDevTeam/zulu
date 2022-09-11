package com.zulu.Mintic_Ciclo3_Textilera.repositories;

import com.zulu.Mintic_Ciclo3_Textilera.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepo extends JpaRepository<MovimientoDinero, Long> {
}
