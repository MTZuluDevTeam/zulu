package com.zulu.Mintic_Ciclo3_Textilera.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {

//  ________ Columnas: _________________________________________________________________________________________________
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idTransaccion;

    @Column (name = "Concepto")
    private String conceptoTransaccion;

    @Column (name = "MontoTransacción")
    private float montoTransaccion;

    @ManyToOne
    @JoinColumn(name = "empleado_id_user")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "empresa_id_empresa")
    private Empresa empresa;

    @Column (name = "FechaCreación")
    private LocalDate fechaCrecacion;

    @Column (name = "FechaModificación")
    private LocalDate fechaModificacion = fechaCrecacion;


//  ________ Construcctor inicializado y vacío: ________________________________________________________________________

    public MovimientoDinero() {  }

    public MovimientoDinero(String conceptoTransaccion, float montoTransaccion, Empleado empleado, Empresa empresa, LocalDate fechaCrecacion, LocalDate fechaModificacion) {
        this.conceptoTransaccion = conceptoTransaccion;
        this.montoTransaccion = montoTransaccion;
        this.empleado = empleado;
        this.empresa = empresa;
        this.fechaCrecacion = fechaCrecacion;
        this.fechaModificacion = fechaModificacion;
    }


// _______ Setters and Getters _________________________________________________________________________________________
    public String getConceptoTransaccion() { return conceptoTransaccion; }

    public void setConceptoTransaccion(String conceptoTransaccion) { this.conceptoTransaccion = conceptoTransaccion; }

    public float getMontoTransaccion() { return montoTransaccion; }

    public void setMontoTransaccion(float montoTransaccion) { this.montoTransaccion = montoTransaccion; }

    public Empleado getEmpleado() { return empleado; }

    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public Empresa getEmpresa() { return empresa; }

    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

    public LocalDate getFechaCrecacion() { return fechaCrecacion; }

    public void setFechaCrecacion(LocalDate fechaCrecacion) { this.fechaCrecacion = fechaCrecacion; }

    public LocalDate getFechaModificacion() { return fechaModificacion; }

    public void setFechaModificacion(LocalDate fechaModificacion) { this.fechaModificacion = fechaModificacion; }
}