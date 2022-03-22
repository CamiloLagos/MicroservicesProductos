package com.inventario.clienteservice.infraestructura.DB;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data @Builder
@Entity
@Table(name = "clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;
    private int tipo_documento;
    private long documento;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String direccion;
}
