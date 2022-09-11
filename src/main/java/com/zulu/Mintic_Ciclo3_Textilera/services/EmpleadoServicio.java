package com.zulu.Mintic_Ciclo3_Textilera.services;

import com.zulu.Mintic_Ciclo3_Textilera.entities.Empleado;
import com.zulu.Mintic_Ciclo3_Textilera.repositories.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpleadoServicio {
    @Autowired
    private EmpleadoRepo empleadoRepo;


//________ Métodos: ____________________________________________________________________________________________________
    public List<Empleado> getEmpleados(){ return empleadoRepo.findAll(); }

    public Empleado getEmpleado(Long id) {
        return empleadoRepo.findById(id).get();
    }

    public void addEmpleado(Empleado listElement) { empleadoRepo.save(listElement); }

    public void updateEmpleado(Empleado Empleado) {
        empleadoRepo.save(Empleado);
    }

    public void deleteEmpleado(Long id) {
        empleadoRepo.deleteById(id);
    }
}