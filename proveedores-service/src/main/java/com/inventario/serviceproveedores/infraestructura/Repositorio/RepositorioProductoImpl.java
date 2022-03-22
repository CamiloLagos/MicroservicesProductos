package com.inventario.serviceproveedores.infraestructura.Repositorio;

import com.inventario.serviceproveedores.dominio.Modelo.ProveedorModelo;
import com.inventario.serviceproveedores.dominio.Repositorio.RepositorioProveedor;
import com.inventario.serviceproveedores.infraestructura.DB.ProveedorBuilder;
import com.inventario.serviceproveedores.infraestructura.DB.ProveedorDao;
import com.inventario.serviceproveedores.infraestructura.DB.ProveedorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RepositorioProductoImpl implements RepositorioProveedor {

    @Autowired
    private ProveedorDao proveedorDao;


    @Override
    public void guardarProveedor(ProveedorModelo proveedorModelo) {
        ProveedorEntity proveedorEntity = ProveedorBuilder.ConvertirAEntidad(proveedorModelo);
        proveedorDao.save(proveedorEntity);
    }

    @Override
    public Optional<ProveedorModelo> obtenerProveedorPorNombre(String nombre) {
        return Optional.empty(); //pending
    }

    @Override
    public Optional<ProveedorModelo> obtenerProveedorPorId(int id) {
        return proveedorDao.findById(id).map(ProveedorBuilder::ConvertirADominio);
    }
}
