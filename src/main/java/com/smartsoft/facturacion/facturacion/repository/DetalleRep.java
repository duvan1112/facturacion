package com.smartsoft.facturacion.facturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartsoft.facturacion.facturacion.model.Detalle;

public interface DetalleRep extends JpaRepository<Detalle,Integer>{
    
}
