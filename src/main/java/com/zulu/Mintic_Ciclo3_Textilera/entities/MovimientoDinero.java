package com.zulu.Mintic_Ciclo3_Textilera.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
<<<<<<< HEAD
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
=======
@Table(name="MovimientoDinero")
public class MovimientoDinero {
//  ________ Columnas: _________________________________________________________________________________________________
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long transactionID; // ID de la transacción.

    @Column(name="concepto")
    private String conceptoMovimiento;      // Descripción del movimiento.
>>>>>>> e523a77dae8d240c19b54bc2ec30cb29f4aaeabd

    @Column(name="monto_transacción")
    private float montoTransaccion;      // Montos positivos y negativos de x movimiento.

<<<<<<< HEAD
//  ________ Construcctor inicializado y vacío: ________________________________________________________________________

    public MovimientoDinero() {  }

    public MovimientoDinero(String conceptoTransaccion, float montoTransaccion, Empleado empleado, Empresa empresa, LocalDate fechaCrecacion, LocalDate fechaModificacion) {
        this.conceptoTransaccion = conceptoTransaccion;
        this.montoTransaccion = montoTransaccion;
        this.empleado = empleado;
        this.empresa = empresa;
        this.fechaCrecacion = fechaCrecacion;
        this.fechaModificacion = fechaModificacion;
=======
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
>>>>>>> e523a77dae8d240c19b54bc2ec30cb29f4aaeabd
    }


// _______ Setters and Getters _________________________________________________________________________________________
<<<<<<< HEAD
    public String getConceptoTransaccion() { return conceptoTransaccion; }

    public void setConceptoTransaccion(String conceptoTransaccion) { this.conceptoTransaccion = conceptoTransaccion; }
=======
    public Long getTransactionID() { return transactionID; }

    public void setTransactionID(Long transactionID) { this.transactionID = transactionID; }

    public String getConceptoMovimiento() { return conceptoMovimiento; }

    public void setConceptoMovimiento(String conceptoMovimiento) { this.conceptoMovimiento = conceptoMovimiento; }
>>>>>>> e523a77dae8d240c19b54bc2ec30cb29f4aaeabd

    public float getMontoTransaccion() { return montoTransaccion; }

    public void setMontoTransaccion(float montoTransaccion) { this.montoTransaccion = montoTransaccion; }

    public Empleado getEmpleado() { return empleado; }

    public void setEmpleado(Empleado empleado) { this.empleado = empleado; }

    public Empresa getEmpresa() { return empresa; }

    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

<<<<<<< HEAD
    public LocalDate getFechaCrecacion() { return fechaCrecacion; }

    public void setFechaCrecacion(LocalDate fechaCrecacion) { this.fechaCrecacion = fechaCrecacion; }

    public LocalDate getFechaModificacion() { return fechaModificacion; }

    public void setFechaModificacion(LocalDate fechaModificacion) { this.fechaModificacion = fechaModificacion; }
=======
    public LocalDate getFechaCreacion() { return fechaCreacion; }

    public void setFechaCreacion(LocalDate fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public LocalDate getFechaModificación() { return fechaModificación; }

    public void setFechaModificación(LocalDate fechaModificación) { this.fechaModificación = fechaModificación; }
>>>>>>> e523a77dae8d240c19b54bc2ec30cb29f4aaeabd
}