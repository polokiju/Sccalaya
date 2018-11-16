package com.ceteq.service;

import java.util.List;

import com.ceteq.model.Producto;

public interface SistemaProductosService {
    List<Producto>findAllProductos();
    Integer createProducto(Producto p);
    Producto findProductoById(Integer id);
    void updateProducto(Producto p);
    void deleteProducto(Producto p);
}
