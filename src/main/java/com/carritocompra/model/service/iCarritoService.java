package com.carritocompra.model.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.carritocompra.model.entity.Carrito;

public interface iCarritoService {

	public List<Carrito> getCarritos();

	public void deleteCarrito(Carrito carrito);

	public void updateCarrito(Carrito carrito);

	public Optional<Carrito> findById(Integer id);

	public void createCarrito(Carrito carrito);
	
	public BigDecimal total();
	

}
