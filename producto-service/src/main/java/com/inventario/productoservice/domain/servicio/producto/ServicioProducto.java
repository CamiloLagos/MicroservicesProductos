package com.inventario.productoservice.domain.servicio.producto;

import com.inventario.productoservice.domain.Modelo.ProductoModelo;
import com.inventario.productoservice.domain.repositorio.producto.RepositorioProducto;


public class ServicioProducto {

    private final RepositorioProducto repositorioProducto;

    public ServicioProducto(RepositorioProducto repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }

    public ProductoModelo buscarProducto(String codigoDeBarras){
        return repositorioProducto.obtenerProductoPorCodigoDeBarras(codigoDeBarras).orElseThrow();
    }

    public void crearProducto(ProductoModelo productoModelo){
        repositorioProducto.guardarProducto(productoModelo);
    }

//    public eliminarProducto(ProductoModelo productoModelo){
//
//    }
}
