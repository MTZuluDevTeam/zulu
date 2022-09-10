package com.zulu.Mintic_Ciclo3_Textilera.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="MovimientoDinero")
public class MovimientoDinero {
//  ________ Columnas: _________________________________________________________________________________________________
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long transactionID; // ID de la transacción.

    @Column(name="concepto")
    private String conceptoMovimiento;      // Descripción del movimiento.

    @Column(name="monto_transacción")
    private float montoTransaccion;      // Montos positivos y negativos de x movimiento.

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empleado_id_user")
    private Empleado empleado; // Id del perfil del usuario que realizó el movimiento del dinero.

    @ManyToOne
    @JoinColumn(name = "empresa_id_empresa")
    private Empresa empresa;

    @Column (name = "FechaCreación")
    private LocalDate fechaCreacion;

    @Column (name = "FechaModificación")
    private LocalDate fechaModificación = this.fechaCreacion;


    //  ________ Construcctor inicializado y vacío: ________________________________________________________________________
    public MovimientoDinero(){
    }

    public MovimientoDinero(String conceptoMovimiento, float montoTransaccion, Empleado empleado, Empresa empresa, LocalDate fechaCreacion, LocalDate fechaModificación) {
        this.conceptoMovimiento = conceptoMovimiento;
        this.montoTransaccion = montoTransaccion;
        this.empleado = empleado;
        this.empresa = empresa;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificación = fechaModificación;
    }


// _______ Setters and Getters _________________________________________________________________________________________
    public Long getTransactionID() { return transactionID; }

    public void setTransactionID(Long transactionID) { this.transactionID = transactionID; }

    public String getConceptoMovimiento() { return conceptoMovimiento; }

    public void setConceptoMovimiento(String conceptoMovimiento) { this.conceptoMovimiento = conceptoMovimiento; }

    public float getMontoTransaccion() { return montoTransaccion; }

    public void setMontoTransaccion(float montoTransaccion) { this.montoTransaccion = montoTransaccion; }

    public Empleado getEmpleado() { return empleado; }

    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public Empresa getEmpresa() { return empresa; }

    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

    public LocalDate getFechaCreacion() { return fechaCreacion; }

    public void setFechaCreacion(LocalDate fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public LocalDate getFechaModificación() { return fechaModificación; }

    public void setFechaModificación(LocalDate fechaModificación) { this.fechaModificación = fechaModificación; }
}