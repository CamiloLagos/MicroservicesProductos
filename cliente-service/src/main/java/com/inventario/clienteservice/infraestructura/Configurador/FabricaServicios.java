package com.inventario.clienteservice.infraestructura.Configurador;

import com.inventario.clienteservice.dominio.repositorio.RepositorioCliente;
import com.inventario.clienteservice.dominio.servicio.ServicioCliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FabricaServicios {

    @Bean
    public ServicioCliente servicioCliente(RepositorioCliente repositorioCliente){
        return new ServicioCliente(repositorioCliente);
    }
}
