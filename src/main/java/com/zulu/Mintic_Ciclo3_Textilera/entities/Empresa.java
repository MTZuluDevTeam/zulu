package com.zulu.Mintic_Ciclo3_Textilera.entities;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany (mappedBy = "empresa")
    private List<Empleado> listaEmpleado;

    @OneToMany (mappedBy = "empresa")
    private List<MovimientoDinero> movimientosEmpresa;


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


// _______ Setters and Getters _________________________________________________________________________________________
    public String getNombreEmpresa() { return nombreEmpresa; }

    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getDireccionEmpresa() { return direccionEmpresa; }

    public void setDireccionEmpresa(String direccionEmpresa) { this.direccionEmpresa = direccionEmpresa; }

    public Long getTelefono() { return telefono; }

    public void setTelefono(Long telefono) { this.telefono = telefono; }

    public Long getNit() { return nit; }

    public void setNit(Long nit) { this.nit = nit; }

    public List<Empleado> getListaEmpleado() { return listaEmpleado; }

    public void setListaEmpleado(List<Empleado> listaEmpleado) { this.listaEmpleado = listaEmpleado; }

    public List<MovimientoDinero> getMovimientosEmpresa() { return movimientosEmpresa; }

    public void setMovimientosEmpresa(List<MovimientoDinero> movimientosEmpresa) { this.movimientosEmpresa = movimientosEmpresa; }
}
