package com.inventario.serviceproveedores.dominio.Modelo;

public class ProveedorModelo {
    private int id_proveedor;
    private String nombre;

    public ProveedorModelo(int id_proveedor, String nombre) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
