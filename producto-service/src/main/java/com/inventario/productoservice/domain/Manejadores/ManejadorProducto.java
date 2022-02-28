package com.inventario.productoservice.domain.Manejadores;

import com.inventario.productoservice.domain.Modelo.ProductoModelo;
import com.inventario.productoservice.domain.servicio.producto.ServicioProducto;
import org.springframework.stereotype.Component;

@Component
public class ManejadorProducto {

    private final ServicioProducto servicioProducto;

    public ManejadorProducto(ServicioProducto servicioProducto) {
        this.servicioProducto = servicioProducto;
    }

    public ProductoModelo buscarProducto(String codigoDeBarras){
        return servicioProducto.buscarProducto(codigoDeBarras);
    }

    public void crearProducto(ProductoModelo productoModelo){
        servicioProducto.crearProducto(productoModelo);
        System.out.println("cree el producto en dominio");
    }
}
