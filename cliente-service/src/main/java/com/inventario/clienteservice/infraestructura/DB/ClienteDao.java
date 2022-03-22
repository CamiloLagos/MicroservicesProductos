package com.inventario.clienteservice.infraestructura.DB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteDao extends JpaRepository<ClienteEntity, Integer> {

    Optional<ClienteEntity> findBydocumento(int documento);

}
