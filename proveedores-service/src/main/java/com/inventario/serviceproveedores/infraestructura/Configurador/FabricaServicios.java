package com.inventario.serviceproveedores.infraestructura.Configurador;

import com.inventario.serviceproveedores.dominio.Repositorio.RepositorioProveedor;
import com.inventario.serviceproveedores.dominio.servicio.ServicioProveedor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FabricaServicios {

    @Bean
    public ServicioProveedor servicioProveedor(RepositorioProveedor repositorioProveedor){
        return new ServicioProveedor(repositorioProveedor);
    }
}
