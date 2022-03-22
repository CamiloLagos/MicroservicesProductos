package com.inventario.serviceproveedores.infraestructura.DB;

import com.inventario.serviceproveedores.dominio.Modelo.ProveedorModelo;

public class ProveedorBuilder {

    public ProveedorBuilder() {
    }

    public static ProveedorModelo ConvertirADominio(ProveedorEntity proveedorEntity){
        return new ProveedorModelo(
                proveedorEntity.getId_productos(),
                proveedorEntity.getNombre());
    }

    public static ProveedorEntity ConvertirAEntidad(ProveedorModelo proveedorModelo){
        return ProveedorEntity.builder()
                .id_productos(proveedorModelo.getId_proveedor())
                .nombre(proveedorModelo.getNombre())
                .activo(true)
                .build();
    }
}
