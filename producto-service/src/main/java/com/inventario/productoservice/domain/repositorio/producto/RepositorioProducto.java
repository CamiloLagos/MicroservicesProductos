package com.inventario.productoservice.domain.repositorio.producto;

import com.inventario.productoservice.domain.Modelo.ProductoModelo;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface RepositorioProducto {

    void guardarProducto(ProductoModelo productoModelo);

    Optional<ProductoModelo> obtenerProductoPorCodigoDeBarras(String codigoDeBarras);

//    Optional<List<ProductoModelo>> obtenerTodos();

    //Optional<String> obtenerSku();
}
