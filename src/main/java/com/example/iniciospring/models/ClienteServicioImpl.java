package com.example.iniciospring.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "clienteServicioImpl")
@Primary
public class ClienteServicioImpl implements ClienteServicio {
    @Autowired
    ClienteRepo clienteRepo ;
    @Override
    public List<Cliente> findAllEmpleados() {
        return null;
    }

    @Override
    public Cliente createEmpleado(Cliente empleado) {
        return new Cliente(1,"implementacion primary",10.0);
    }

    @Override
    public void updateEmpleado(Cliente empleado) {

    }

    @Override
    public void deleteEmpleado(Long id) {

    }

    @Override
    public Cliente findEmpleadoById(Long id) {
        return null;
    }
}
