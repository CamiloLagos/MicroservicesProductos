package com.inventario.productoservice.domain.Modelo;

import java.time.LocalDateTime;

public class ProductoModelo {
    private int id;
    private String nombre;
    private String descripcion;
    private String sku;
    private String codigo_barras;
    private Double precio;
    private LocalDateTime fecha;

    public ProductoModelo(int id, String nombre, String descripcion, String sku, String codigo_barras, double precio, LocalDateTime fecha) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sku = sku;
        this.codigo_barras = codigo_barras;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
