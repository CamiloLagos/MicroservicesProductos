package com.inventario.clienteservice.infraestructura.Repositorio;

import com.inventario.clienteservice.dominio.Modelo.ClienteModelo;
import com.inventario.clienteservice.dominio.repositorio.RepositorioCliente;
import com.inventario.clienteservice.infraestructura.DB.ClienteBuilder;
import com.inventario.clienteservice.infraestructura.DB.ClienteDao;
import com.inventario.clienteservice.infraestructura.DB.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RepositorioProductoImpl implements RepositorioCliente {

    @Autowired
    private ClienteDao clienteDao;

    @Override
    public void guardarCliente(ClienteModelo clienteModelo) {
        ClienteEntity clienteEntity = ClienteBuilder.ConvertirAEntidad(clienteModelo);
        clienteDao.save(clienteEntity);
    }

    @Override
    public Optional<ClienteModelo> obtenerClientePorDocumento(int documento) {
        return clienteDao.findBydocumento(documento).map(ClienteBuilder::ConvertirADominio);
    }
}
