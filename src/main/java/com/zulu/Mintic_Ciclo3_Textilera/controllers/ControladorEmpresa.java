package com.zulu.Mintic_Ciclo3_Textilera.controllers;

import com.zulu.Mintic_Ciclo3_Textilera.entities.Empresa;
import com.zulu.Mintic_Ciclo3_Textilera.services.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/enterprises")
public class ControladorEmpresa {
    @Autowired
    private EmpresaServicio empresaServicio;

    @GetMapping
    public List<Empresa> getEmpresas() { return empresaServicio.getEmpresas(); }

    @PostMapping
    public void addEmpresa(@RequestBody Empresa empresa) { empresaServicio.addEmpresas(empresa); }

    @GetMapping("/{id}")
    public Empresa getEmpresa(@PathVariable("id") Long id) {
        return empresaServicio.getEmpresa(id);
    }

    @PatchMapping("/{id}")
    public void updateEmpresa(@RequestBody Empresa empresa) { empresaServicio.updateEmpresa(empresa); }

    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable("id") Long id) {
        empresaServicio.deleteEmpresa(id);
    }
}