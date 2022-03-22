package com.inventario.serviceproveedores.dominio.Repositorio;

import com.inventario.serviceproveedores.dominio.Modelo.ProveedorModelo;

import java.util.Optional;

public interface RepositorioProveedor {

    void guardarProveedor(ProveedorModelo proveedorModelo);

    Optional<ProveedorModelo> obtenerProveedorPorNombre(String nombre);

    Optional<ProveedorModelo> obtenerProveedorPorId(int id);
}
