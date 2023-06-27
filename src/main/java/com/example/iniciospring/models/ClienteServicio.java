package com.example.iniciospring.models;

import java.util.List;

public interface ClienteServicio {
    List<Cliente> findAllEmpleados();
    Cliente createEmpleado(Cliente empleado);
    void updateEmpleado(Cliente empleado);
    void deleteEmpleado(Long id);
    Cliente findEmpleadoById(Long id);
}
