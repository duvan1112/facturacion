package com.smartsoft.facturacion.facturacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartsoft.facturacion.facturacion.model.Cliente;
import com.smartsoft.facturacion.facturacion.repository.ClienteRep;
import com.smartsoft.facturacion.facturacion.repository.FacturacionRep;

import java.util.List;

@RestController
@RequestMapping("/facturacion/")
public class FacturacionRestController {

  
    @Autowired
    private ClienteRep clienteRep;

    @GetMapping("/clientes")
    public List<Cliente> listaClientes(){
        return clienteRep.findAll();
    }


    
}
