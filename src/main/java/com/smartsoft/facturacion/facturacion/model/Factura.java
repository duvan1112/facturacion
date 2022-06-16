package com.smartsoft.facturacion.facturacion.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_factura")
    private int num_factura;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    public Factura() {

    }
    


    /**
     * @return int return the num_factura
     */
    public int getNum_factura() {
        return num_factura;
    }

    /**
     * @param num_factura the num_factura to set
     */
    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    /**
     * @return Cliente return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return LocalDateTime return the fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

}
