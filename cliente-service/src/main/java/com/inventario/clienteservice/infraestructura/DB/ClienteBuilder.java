package com.inventario.clienteservice.infraestructura.DB;

import com.inventario.clienteservice.dominio.Modelo.ClienteModelo;

public class ClienteBuilder {

    public ClienteBuilder() {
    }

    public static ClienteModelo ConvertirADominio(ClienteEntity clienteEntity){
        return new ClienteModelo(
                clienteEntity.getTipo_documento(),
                clienteEntity.getDocumento(),
                clienteEntity.getNombres(),
                clienteEntity.getApellidos(),
                clienteEntity.getTelefono(),
                clienteEntity.getCorreo(),
                clienteEntity.getDireccion()
        );
    }

    public static ClienteEntity ConvertirAEntidad(ClienteModelo clienteModelo){
        return ClienteEntity.builder()
                .tipo_documento(clienteModelo.getTipo_documento())
                .documento(clienteModelo.getDocumento())
                .nombres(clienteModelo.getNombres())
                .apellidos(clienteModelo.getApellidos())
                .telefono(clienteModelo.getTelefono())
                .correo(clienteModelo.getCorreo())
                .direccion(clienteModelo.getDireccion())
                .build();
    }
}
