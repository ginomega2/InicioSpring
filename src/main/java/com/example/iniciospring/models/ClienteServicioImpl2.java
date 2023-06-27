package com.example.iniciospring.models;

import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "clienteServicioImpl2")
public class ClienteServicioImpl2 implements ClienteServicio {
    @Override
    public List<Cliente> findAllEmpleados() {
        return null;
    }

    @Override
    public Cliente createEmpleado(Cliente empleado) {
        return new Cliente(1,"implementacion 2 usar con qualifier",10.0);
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
