package com.inventario.productoservice.infraestructura.Configurador;

import com.inventario.productoservice.domain.repositorio.producto.RepositorioProducto;
import com.inventario.productoservice.domain.servicio.producto.ServicioProducto;
import com.inventario.productoservice.infraestructura.Controlador.ControladorProducto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FabricaServicios {

    @Bean
    public ServicioProducto servicioProducto(RepositorioProducto repositorioProducto){
        return new ServicioProducto(repositorioProducto);
    }
}
