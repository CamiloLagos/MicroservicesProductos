package com.inventario.serviceproveedores.infraestructura.Controlador;

import com.inventario.serviceproveedores.dominio.Manejador.ManejadorProveedor;
import com.inventario.serviceproveedores.dominio.Modelo.ProveedorModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("proveedores")
public class ControladorProveedor {

    @Autowired
    private ManejadorProveedor manejadorProveedor;

    @GetMapping(value = "/info")
    public ResponseEntity<String> info() {
        return ResponseEntity.ok("Aplication is up!");
    }

    @PostMapping
    public ResponseEntity<String> crearProveedor(@RequestBody ProveedorModelo proveedorModelo){
        manejadorProveedor.crearProveedor(proveedorModelo);
        return ResponseEntity.ok("Proveedor creado!");
    }
}
