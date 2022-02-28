package com.inventario.productoservice.infraestructura.Controlador;

import com.inventario.productoservice.domain.Manejadores.ManejadorProducto;
import com.inventario.productoservice.domain.Modelo.ProductoModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("productos")
public class ControladorProducto {

    @Autowired
    private ManejadorProducto manejadorProducto;

    @PostMapping
    public ResponseEntity<String> crearProducto(@RequestBody ProductoModelo productoModelo){
         manejadorProducto.crearProducto(productoModelo);
         return ResponseEntity.ok("Producto creado!");
    }

    //@GetMapping


}
