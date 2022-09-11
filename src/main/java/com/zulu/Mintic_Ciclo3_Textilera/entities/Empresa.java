package com.zulu.Mintic_Ciclo3_Textilera.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresa")
public class Empresa {
<<<<<<< HEAD

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
=======
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
>>>>>>> e523a77dae8d240c19b54bc2ec30cb29f4aaeabd
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefono = telefono;
        this.nit = nit;
<<<<<<< HEAD
        this.listaEmpleado = listaEmpleado;
        this.movimientosEmpresa = movimientosEmpresa;
    }

=======
        /**this.listaEmpleado = listaEmpleado;
        this.movimientosDineroEmpresa = movimientosDineroEmpresa;**/
    }


// _______ Setters and Getters _________________________________________________________________________________________
    public Long getIdEmpresa() { return idEmpresa; }

    public void setIdEmpresa(Long idEmpresa) { this.idEmpresa = idEmpresa; }

    public String getnombreEmpresa() {
        return nombreEmpresa;
    }
>>>>>>> e523a77dae8d240c19b54bc2ec30cb29f4aaeabd

// _______ Setters and Getters _________________________________________________________________________________________
    public String getNombreEmpresa() { return nombreEmpresa; }

    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getDireccionEmpresa() { return direccionEmpresa; }

    public void setDireccionEmpresa(String direccionEmpresa) { this.direccionEmpresa = direccionEmpresa; }

    public Long getTelefono() { return telefono; }

    public void setTelefono(Long telefono) { this.telefono = telefono; }

<<<<<<< HEAD
    public Long getNit() { return nit; }

    public void setNit(Long nit) { this.nit = nit; }

    public List<Empleado> getListaEmpleado() { return listaEmpleado; }

    public void setListaEmpleado(List<Empleado> listaEmpleado) { this.listaEmpleado = listaEmpleado; }

    public List<MovimientoDinero> getMovimientosEmpresa() { return movimientosEmpresa; }

    public void setMovimientosEmpresa(List<MovimientoDinero> movimientosEmpresa) { this.movimientosEmpresa = movimientosEmpresa; }
}
=======
    public void setNit(Long nit) {
        this.nit = nit;
    }

    /**public List<Empleado> getListaEmpleado() { return listaEmpleado; }

    public void setListaEmpleado(List<Empleado> listaEmpleado) { this.listaEmpleado = listaEmpleado; }

    public List<MovimientoDinero> getMovimientosDineroEmpresa() { return movimientosDineroEmpresa; }

    public void setMovimientosDineroEmpresa(List<MovimientoDinero> movimientosDineroEmpresa) { this.movimientosDineroEmpresa = movimientosDineroEmpresa; }**/
}
>>>>>>> e523a77dae8d240c19b54bc2ec30cb29f4aaeabd
