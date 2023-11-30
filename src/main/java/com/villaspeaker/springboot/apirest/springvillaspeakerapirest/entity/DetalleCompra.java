package com.villaspeaker.springboot.apirest.springvillaspeakerapirest.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "detalle_compra")
public class DetalleCompra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    private Double precioCompra;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproducto")
    private Producto producto;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private static final long serialVersionUID = 1L;
}
