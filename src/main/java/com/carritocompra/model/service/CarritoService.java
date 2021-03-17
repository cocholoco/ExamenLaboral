package com.carritocompra.model.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.carritocompra.model.dao.iCarritoDao;
import com.carritocompra.model.entity.Carrito;

@Service
public class CarritoService implements iCarritoService {

	@Autowired
	private iCarritoDao carritoDao;

	@Override

	public List<Carrito> getCarritos() {

		return (List<Carrito>) carritoDao.findAll();
	}

	@Override
	@Query("delete from carrito c where c.id  = :carrito.id")
	public void deleteCarrito(@Param("carrito") Carrito carrito) {
		carritoDao.delete(carrito);

	}

	@Override
	public Optional<Carrito> findById(Integer id) {
		return carritoDao.findById(Long.parseLong(id.toString()));
	}

	@Override
	public void updateCarrito(Carrito carrito) {
		carritoDao.save(carrito);
	}

	@Override
	public void createCarrito(Carrito carrito) {
		carritoDao.save(carrito);

	}
	
	@Override
	public BigDecimal total() {
		return carritoDao.total();
	}
	
	
	
	
	
	
	

}
