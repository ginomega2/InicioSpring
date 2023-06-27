package com.example.iniciospring.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired()
    @Qualifier(value = "clienteServicioImpl")
//    @Qualifier(value = "clienteServicioImpl2")
    ClienteServicio clienteServicio;

    @GetMapping("/") // http://localhost:8080/
    public String hola(){
        clienteServicio.createEmpleado(new Cliente());
        return clienteServicio.createEmpleado(new Cliente()).toString();
    }
}
