package com.carritocompra.model.service;

import java.util.List;
import java.util.Optional;

import com.carritocompra.model.entity.Producto;

public interface iProductoService {

	public List<Producto> getProductos();

	public void deleteProducto(Producto producto);

	public Optional<Producto> findById(Integer id);

}
