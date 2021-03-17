package com.carritocompra.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritocompra.model.dao.iProductoDao;
import com.carritocompra.model.entity.Producto;

@Service
public class ProductoService implements iProductoService {

	@Autowired
	private iProductoDao productoDao;

	@Override
	public List<Producto> getProductos() {

		return (List<Producto>) productoDao.findAll();
	}
	
	@Override
	public void deleteProducto( Producto producto) {
		productoDao.delete(producto);
		
	}
	
	@Override
	public Optional<Producto> findById(Integer id) {
		return productoDao.findById(Long.parseLong(id.toString()));
	}

}
