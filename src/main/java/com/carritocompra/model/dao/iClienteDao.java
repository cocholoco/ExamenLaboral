package com.carritocompra.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.carritocompra.model.entity.Cliente;

public interface iClienteDao extends CrudRepository<Cliente, Long> {

}
