package com.inventario.serviceproveedores.dominio.Manejador;

import com.inventario.serviceproveedores.dominio.Modelo.ProveedorModelo;
import com.inventario.serviceproveedores.dominio.servicio.ServicioProveedor;
import org.springframework.stereotype.Component;

@Component
public class ManejadorProveedor {

    private final ServicioProveedor servicioProveedor;

    public ManejadorProveedor(ServicioProveedor servicioProveedor) {
        this.servicioProveedor = servicioProveedor;
    }

    public ProveedorModelo buscarProveedor(int id){
        return servicioProveedor.buscarProveedor(id);
    }

    public ProveedorModelo buscarProveedorPorNombre(String nombre){
        return servicioProveedor.buscarProveedorPorNombre(nombre);
    }

    public void crearProveedor(ProveedorModelo proveedorModelo){
        servicioProveedor.crearProveedor(proveedorModelo);
        System.out.println("Cree el proveedor en dominio");
    }
}
