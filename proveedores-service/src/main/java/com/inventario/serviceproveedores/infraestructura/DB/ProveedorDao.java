package com.inventario.serviceproveedores.infraestructura.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorDao extends JpaRepository<ProveedorEntity, Integer> {
}
