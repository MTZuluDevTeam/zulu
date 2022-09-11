package com.zulu.Mintic_Ciclo3_Textilera.repositories;

import com.zulu.Mintic_Ciclo3_Textilera.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {
}