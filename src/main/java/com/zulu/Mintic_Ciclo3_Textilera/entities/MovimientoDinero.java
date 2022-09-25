package com.zulu.Mintic_Ciclo3_Textilera.entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movimiento_dinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long transactionID; // ID de la transacción.

    @Column(name = "concepto_movimiento")
    String conceptoMovimiento;      // Descripción del movimiento.

    @Column(name = "monto_dinero")
    float montoDinero = 0.0f;      // Montos positivos y negativos de x movimiento.

    @Temporal(TemporalType.DATE)
    Date fechaMovimiento;


    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado; // Id del perfil del usuario que realizó el movimiento del dinero.



    public MovimientoDinero(){
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public MovimientoDinero (Long transactionID, float montoDinero, String conceptoMovimiento, Date fechaMovimiento){
        this.transactionID = transactionID;
        this.montoDinero = montoDinero;
        this.conceptoMovimiento = conceptoMovimiento;
        this.fechaMovimiento = fechaMovimiento;

    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public float getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(float montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}