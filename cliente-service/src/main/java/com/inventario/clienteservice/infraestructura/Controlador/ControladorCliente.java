package com.inventario.clienteservice.infraestructura.Controlador;

import com.inventario.clienteservice.dominio.Manejadores.ManejadorCliente;
import com.inventario.clienteservice.dominio.Modelo.ClienteModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ControladorCliente {

    @Autowired
    private ManejadorCliente manejadorCliente;

    @GetMapping(value = "/info")
    public ResponseEntity<String> info(){
        return ResponseEntity.ok("Aplication is up!");
    }

    @PostMapping
    public ResponseEntity<String> crearCliente(@RequestBody ClienteModelo clienteModelo){
        manejadorCliente.crearCliente(clienteModelo);
        return ResponseEntity.ok("Cliente creado!");
    }
}
