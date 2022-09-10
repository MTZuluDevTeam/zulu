package com.zulu.Mintic_Ciclo3_Textilera.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresa")
public class Empresa {
//  ________ Columnas: _________________________________________________________________________________________________
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpresa;

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name = "direccion_empresa")
    private String direccionEmpresa;

    @Column(name = "teléfono")
    private Long telefono;

    @Column(name = "nit")
    private Long nit;

    /**@OneToMany(mappedBy = "empresa")
    private List<Empleado> listaEmpleado;

    @OneToMany (mappedBy = "empresa")
    private List<MovimientoDinero> movimientosDineroEmpresa;**/


//  ________ Construcctor inicializado y vacío: ________________________________________________________________________
    public Empresa(){}

    public Empresa(String nombreEmpresa, String direccionEmpresa, Long telefono, Long nit, List<Empleado> listaEmpleado) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefono = telefono;
        this.nit = nit;
        /**this.listaEmpleado = listaEmpleado;
        this.movimientosDineroEmpresa = movimientosDineroEmpresa;**/
    }


// _______ Setters and Getters _________________________________________________________________________________________
    public Long getIdEmpresa() { return idEmpresa; }

    public void setIdEmpresa(Long idEmpresa) { this.idEmpresa = idEmpresa; }

    public String getnombreEmpresa() {
        return nombreEmpresa;
    }

    public void setnombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getdireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setdireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    /**public List<Empleado> getListaEmpleado() { return listaEmpleado; }

    public void setListaEmpleado(List<Empleado> listaEmpleado) { this.listaEmpleado = listaEmpleado; }

    public List<MovimientoDinero> getMovimientosDineroEmpresa() { return movimientosDineroEmpresa; }

    public void setMovimientosDineroEmpresa(List<MovimientoDinero> movimientosDineroEmpresa) { this.movimientosDineroEmpresa = movimientosDineroEmpresa; }**/
}