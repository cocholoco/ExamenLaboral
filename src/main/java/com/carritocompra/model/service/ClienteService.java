package com.carritocompra.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritocompra.model.dao.iClienteDao;
import com.carritocompra.model.entity.Cliente;

@Service
public class ClienteService implements iClienteService {

	@Autowired
	private iClienteDao clienteDao;

	@Override
	public List<Cliente> getClientes() {

		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Override
	public void deleteCliente( Cliente cliente) {
		clienteDao.delete(cliente);
		
	}
	
	@Override
	public Optional<Cliente> findById(Integer id) {
		return clienteDao.findById(Long.parseLong(id.toString()));
	}

}
