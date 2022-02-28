package com.inventario.productoservice.infraestructura.Repositorio;

import com.inventario.productoservice.domain.Modelo.ProductoModelo;
import com.inventario.productoservice.domain.repositorio.producto.RepositorioProducto;
import com.inventario.productoservice.infraestructura.DB.ProductoBuilder;
import com.inventario.productoservice.infraestructura.DB.ProductoDao;

import com.inventario.productoservice.infraestructura.DB.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RepositorioProductoImpl implements RepositorioProducto {

    @Autowired
    private ProductoDao productoDao;

    @Override
    public void guardarProducto(ProductoModelo productoModelo) {
        ProductoEntity productoEntity = ProductoBuilder.ConvertirAEntidad(productoModelo);
        productoDao.save(productoEntity);
    }

    @Override
    public Optional<ProductoModelo> obtenerProductoPorCodigoDeBarras(String codigoDeBarras) {
        return productoDao.findById(123).map(ProductoBuilder::ConvertirADominio);
    }

//    @Override
//    public Optional<List<ProductoModelo>> obtenerTodos() {
////        Optional<List<ProductoModelo>> productoModelos = productoDao.findAll().forEach(productoEntity -> {
////
////        });
//        return new ProductoModelo(12,"","","","",1.1, LocalDateTime.MAX);
//    }
}
