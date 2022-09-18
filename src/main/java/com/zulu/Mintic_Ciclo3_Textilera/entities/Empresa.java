package com.zulu.Mintic_Ciclo3_Textilera.entities;



import com.zulu.Mintic_Ciclo3_Textilera.services.EmpleadoServicio;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

@Table(name = "empresa")
public class Empresa {


//  ________ Columnas: _________________________________________________________________________________________________

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idEmpresa;

    @Column (name = "nombre_empresa")
    private String nombreEmpresa;
    @Column (name = "direccion_empresa")
    private String direccionEmpresa;

    @Column (name = "telefono")
    private Long telefono;

    @Column (name = "nit")
    private Long nit;




//  ________ Construcctor inicializado y vacío: ________________________________________________________________________
    public Empresa() { }

    public Empresa(String nombreEmpresa, String direccionEmpresa, Long telefono, Long nit, List<Empleado> listaEmpleado, List<MovimientoDinero> movimientosEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefono = telefono;
        this.nit = nit;
        this.listaEmpleado = listaEmpleado;
        this.movimientosEmpresa = movimientosEmpresa;
    }


    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa; }


// _______ Setters and Getters _________________________________________________________________________________________
    public String getNombreEmpresa() { return nombreEmpresa; }

    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getDireccionEmpresa() { return direccionEmpresa; }

    public void setDireccionEmpresa(String direccionEmpresa) { this.direccionEmpresa = direccionEmpresa; }

    public Long getTelefono() { return telefono; }

    public void setTelefono(Long telefono) { this.telefono = telefono; }



    public Long getNit() { return nit; }  
     

    public void setNit(Long nit) { this.nit = nit; }   

    

}
