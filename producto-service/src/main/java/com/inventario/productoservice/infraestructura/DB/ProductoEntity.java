package com.inventario.productoservice.infraestructura.DB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id;

    private String nombre;

    private String descripcion;

    private String sku;

    private String codigo_barras;

    private Double precio;

    private LocalDateTime fecha_registro;
}
