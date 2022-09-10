package com.zulu.Mintic_Ciclo3_Textilera.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {
//  ________ Columnas: _________________________________________________________________________________________________
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;

    @Column(name = "nombres", length = 50)
    private String nombres;

    @Column(name = "apellidos", length = 50)
    private String apellidos;

    @Column(name = "correo", length = 50)
    private String correo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
//---------------------------------------------
    /**@OneToMany (mappedBy = "empleado")
    private List<MovimientoDinero> movimientosDineroEmpleado;**/
//---------------------------------------------
    @Enumerated(EnumType.STRING)
    private NombresDeRol rol;


//  ________ Construcctor inicializado y vacío: ________________________________________________________________________
    public Empleado(){}

    public Empleado(String nombres, String apellidos, String correo, Empresa empresa, NombresDeRol rol) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        //----------------------------------------------------
        this.empresa = empresa;
        //this.movimientosDineroEmpleado = movimientosDineroEmpleado; //OnetoMany movimientosDineroEmpresa
        this.rol = rol;
        //----------------------------------------------------
    }


// _______ Setters and Getters _________________________________________________________________________________________
    public Long getIdUser() {
    return idUser;
}

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public NombresDeRol getRol() {
        return rol;
    }

    public void setRol(NombresDeRol rol) {
        this.rol = rol;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**public List<MovimientoDinero> movimientosDineroEmpleado() { return movimientosDineroEmpleado; }

    public void setMovimientosDineroEmpleado(List<MovimientoDinero> movimientosDineroEmpleado) { this.movimientosDineroEmpleado = movimientosDineroEmpleado; }**/
}