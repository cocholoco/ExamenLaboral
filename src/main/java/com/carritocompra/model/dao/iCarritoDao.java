package com.carritocompra.model.dao;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.carritocompra.model.entity.Carrito;

public interface iCarritoDao extends CrudRepository<Carrito, Long> {
	
	
@Query(value = "SELECT sum(total) FROM Carrito where total < 500 ")
public BigDecimal total();
	
	

}
