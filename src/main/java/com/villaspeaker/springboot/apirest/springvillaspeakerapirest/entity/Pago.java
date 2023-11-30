package com.villaspeaker.springboot.apirest.springvillaspeakerapirest.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pago")
public class Pago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double monto;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @OneToOne(mappedBy = "pago")
    private Compra compra;

    @PrePersist
    public void prePersist(){
        fecha = new Date();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    private static final long serialVersionUID = 1L;
}
