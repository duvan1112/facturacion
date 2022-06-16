package com.smartsoft.facturacion.facturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartsoft.facturacion.facturacion.model.Producto;

public interface ProductoRep extends JpaRepository<Producto,Integer> {
    
}
