package com.zulu.Mintic_Ciclo3_Textilera.controllers;

import com.zulu.Mintic_Ciclo3_Textilera.entities.Empresa;
import com.zulu.Mintic_Ciclo3_Textilera.entities.MovimientoDinero;
import com.zulu.Mintic_Ciclo3_Textilera.services.EmpresaServicio;
import com.zulu.Mintic_Ciclo3_Textilera.services.MovimientoDineroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movements")
public class ControladorMovimientoDinero {
    @Autowired
    private MovimientoDineroServicio movimientoDineroServicio;

    @GetMapping
    public List<MovimientoDinero> getMovimientos() { return movimientoDineroServicio.getMovimientosDinero(); }

    @GetMapping("/{id}")
    public MovimientoDinero getMovimiento(@PathVariable("id") Long id) { return movimientoDineroServicio.getMovimientoDinero(id); }

    @PostMapping
    public void addMovimientoDinero (@RequestBody MovimientoDinero newMovimiento) { movimientoDineroServicio.addMovimientoDinero(newMovimiento); }

    @PatchMapping("/{id}")
    public void updateMovimientoDinero(@RequestBody MovimientoDinero updateMovimineto) { movimientoDineroServicio.updateMovimientoDinero(updateMovimineto); }

    @DeleteMapping("/{id}")
    public void delMovimiento(@PathVariable("id") Long id) {
        movimientoDineroServicio.delMoviminetoDinero(id);
    }
}
