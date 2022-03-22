package com.inventario.clienteservice.dominio.repositorio;

import com.inventario.clienteservice.dominio.Modelo.ClienteModelo;

import java.util.Optional;

public interface RepositorioCliente {

    void guardarCliente(ClienteModelo clienteModelo);

    Optional<ClienteModelo> obtenerClientePorDocumento(int documento);
}
