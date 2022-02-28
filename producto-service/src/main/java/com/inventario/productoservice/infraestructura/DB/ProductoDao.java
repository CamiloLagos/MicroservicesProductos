package com.inventario.productoservice.infraestructura.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoDao extends JpaRepository<ProductoEntity, Integer> {

    //Optional<ProductoEntity> FindBycodigo_barras();
}
