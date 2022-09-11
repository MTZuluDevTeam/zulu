package com.zulu.Mintic_Ciclo3_Textilera.services;

import com.zulu.Mintic_Ciclo3_Textilera.entities.Empresa;
import com.zulu.Mintic_Ciclo3_Textilera.entities.MovimientoDinero;
import com.zulu.Mintic_Ciclo3_Textilera.repositories.EmpresaRepositorio;
import com.zulu.Mintic_Ciclo3_Textilera.repositories.MovimientoDineroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoDineroServicio {
    @Autowired
    private MovimientoDineroRepo movimientoDineroRepo;


    //________ Métodos: ____________________________________________________________________________________________________
    public List<MovimientoDinero> getMovimientosDinero(){ return movimientoDineroRepo.findAll(); }

    public MovimientoDinero getMovimientoDinero(Long id){ return movimientoDineroRepo.findById(id).get(); }

    public void addMovimientoDinero(MovimientoDinero newMovimiento) { movimientoDineroRepo.save(newMovimiento); }

    public void updateMovimientoDinero(MovimientoDinero updateMovimineto) { movimientoDineroRepo.save(updateMovimineto); }

    public void delMoviminetoDinero (Long id) {
        movimientoDineroRepo.deleteById(id);
    }
}
