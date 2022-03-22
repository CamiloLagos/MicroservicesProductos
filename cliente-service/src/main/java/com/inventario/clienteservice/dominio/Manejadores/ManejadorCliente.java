package com.inventario.clienteservice.dominio.Manejadores;

import com.inventario.clienteservice.dominio.Modelo.ClienteModelo;
import com.inventario.clienteservice.dominio.servicio.ServicioCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCliente {

    private final ServicioCliente servicioCliente;

    public ManejadorCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    public ClienteModelo buscarCliente(int documento){
        return servicioCliente.buscarCliente(documento);
    }

    public void crearCliente(ClienteModelo clienteModelo){
        servicioCliente.crearCliente(clienteModelo);
        System.out.println("Cree el cliente en dominio");
    }
}
