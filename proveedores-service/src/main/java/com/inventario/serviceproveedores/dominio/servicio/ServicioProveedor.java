package com.inventario.serviceproveedores.dominio.servicio;

import com.inventario.serviceproveedores.dominio.Modelo.ProveedorModelo;
import com.inventario.serviceproveedores.dominio.Repositorio.RepositorioProveedor;

public class ServicioProveedor {

    private final RepositorioProveedor repositorioProveedor;

    public ServicioProveedor(RepositorioProveedor repositorioProveedor) {
        this.repositorioProveedor = repositorioProveedor;
    }

    public ProveedorModelo buscarProveedor(int id){
        return repositorioProveedor.obtenerProveedorPorId(id).orElseThrow();
    }

    public ProveedorModelo buscarProveedorPorNombre(String nombre){
        return repositorioProveedor.obtenerProveedorPorNombre(nombre).orElseThrow();
    }

    public void crearProveedor(ProveedorModelo proveedorModelo){
        repositorioProveedor.guardarProveedor(proveedorModelo);
    }
}
