package com.carritocompra.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.carritocompra.model.entity.Producto;

public interface iProductoDao extends CrudRepository<Producto, Long> {

}
