package com.smartsoft.facturacion.facturacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartsoft.facturacion.facturacion.model.Cliente;

public interface ClienteRep extends JpaRepository<Cliente,Integer>{
    
}
