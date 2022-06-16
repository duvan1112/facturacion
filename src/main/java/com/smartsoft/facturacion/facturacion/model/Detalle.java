package com.smartsoft.facturacion.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalles")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_detalle")
    private int num_detalle;

    @ManyToOne
    @JoinColumn(name = "id_factura", referencedColumnName = "num_factura")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @Column(name = "cantidad")
    private String cantidad;

    @Column(name = "precio")
    private String precio;

    public Detalle() {

    }

    /**
     * @return int return the num_detalle
     */
    public int getNum_detalle() {
        return num_detalle;
    }

    /**
     * @param num_detalle the num_detalle to set
     */
    public void setNum_detalle(int num_detalle) {
        this.num_detalle = num_detalle;
    }

    /**
     * @return Factura return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return Producto return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return String return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return String return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
