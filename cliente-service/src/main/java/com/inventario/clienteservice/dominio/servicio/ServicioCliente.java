package com.inventario.clienteservice.dominio.servicio;

import com.inventario.clienteservice.dominio.Modelo.ClienteModelo;
import com.inventario.clienteservice.dominio.repositorio.RepositorioCliente;

public class ServicioCliente {

    private final RepositorioCliente repositorioCliente;

    public ServicioCliente(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    public ClienteModelo buscarCliente(int documento){
        return repositorioCliente.obtenerClientePorDocumento(documento).orElseThrow();
    }

    public void crearCliente(ClienteModelo clienteModelo){
        repositorioCliente.guardarCliente(clienteModelo);
    }
}
