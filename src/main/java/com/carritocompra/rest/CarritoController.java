package com.carritocompra.rest;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carritocompra.model.entity.Carrito;
import com.carritocompra.model.entity.Cliente;
import com.carritocompra.model.entity.Producto;
import com.carritocompra.model.service.iCarritoService;
import com.carritocompra.model.service.iClienteService;
import com.carritocompra.model.service.iProductoService;

@RestController
@RequestMapping(value = "carrito")
public class CarritoController {

	@Autowired
	private iCarritoService carritoService;

	@Autowired
	private iProductoService productoService;

	@Autowired
	private iClienteService clienteService;

	@CrossOrigin(allowedHeaders = "*")
	@GetMapping(value = "getCarritos")
	public List<Carrito> getCarritos() {
		return carritoService.getCarritos();
	}

	@CrossOrigin(allowedHeaders = "*")
	@GetMapping(value = "getProductos")
	public List<Producto> getProductos() {
		return productoService.getProductos();
	}

	@CrossOrigin(allowedHeaders = "*")
	@GetMapping(value = "getClientes")
	public List<Cliente> getClientes() {
		return clienteService.getClientes();
	}

	@CrossOrigin(allowedHeaders = "*")
	@GetMapping(value = "/{id}")
	public Carrito getCarrito(@PathVariable(value = "id") Integer carritoId) {
		return carritoService.findById(carritoId).get();
	}

	@CrossOrigin(allowedHeaders = "*")
	@DeleteMapping("/{id}")
	public void deleteCarrito(@PathVariable(value = "id") Integer carritoId) {
		Carrito carrito = carritoService.findById(carritoId).get();
		carritoService.deleteCarrito(carrito);
	}

	@CrossOrigin(allowedHeaders = "*")
	@PutMapping("/{id}")
	public void updateCarrito(@PathVariable(value = "id") Integer carritoId, @RequestBody Carrito carrito) {
		carritoService.updateCarrito(carrito);
	}

	@CrossOrigin(allowedHeaders = "*")
	@PostMapping
	public void createCarrito(@RequestBody Carrito carrito) {
		carritoService.createCarrito(carrito);
	}


	@CrossOrigin(allowedHeaders = "*")
	@GetMapping(value = "gettotal")
	public  BigDecimal gettotal() {
	return carritoService.total();
	}





}
