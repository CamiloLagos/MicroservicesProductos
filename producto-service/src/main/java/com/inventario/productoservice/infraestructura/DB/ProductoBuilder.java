package com.inventario.productoservice.infraestructura.DB;

import com.inventario.productoservice.domain.Modelo.ProductoModelo;

public class ProductoBuilder {

    public ProductoBuilder() {
    }

    public static ProductoModelo ConvertirADominio(ProductoEntity productoEntity){
        return new ProductoModelo(
                productoEntity.getId(),
                productoEntity.getNombre(),
                productoEntity.getDescripcion(),
                productoEntity.getSku(),
                productoEntity.getCodigo_barras(),
                productoEntity.getPrecio(),
                productoEntity.getFecha_registro()
        );
    }

    public static ProductoEntity ConvertirAEntidad(ProductoModelo productoModelo){
        return new ProductoEntity(
                productoModelo.getId(),
                productoModelo.getNombre(),
                productoModelo.getDescripcion(),
                productoModelo.getSku(),
                productoModelo.getCodigo_barras(),
                productoModelo.getPrecio(),
                productoModelo.getFecha()
        );
    }
}
