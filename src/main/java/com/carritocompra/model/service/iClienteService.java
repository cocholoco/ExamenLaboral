package com.carritocompra.model.service;

import java.util.List;
import java.util.Optional;

import com.carritocompra.model.entity.Cliente;

public interface iClienteService {

	public List<Cliente> getClientes();

	public void deleteCliente(Cliente cliente);

	public Optional<Cliente> findById(Integer id);

}
