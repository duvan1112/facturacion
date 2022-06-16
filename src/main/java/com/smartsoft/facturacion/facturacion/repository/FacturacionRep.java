package com.smartsoft.facturacion.facturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartsoft.facturacion.facturacion.model.Factura;

public interface FacturacionRep extends JpaRepository<Factura,Integer>{
    
}
