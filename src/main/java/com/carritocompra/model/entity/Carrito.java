package com.carritocompra.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@ManyToMany
	@JoinTable(name = "carrito_producto", joinColumns = @JoinColumn(name = "carrito_id"), inverseJoinColumns = @JoinColumn(name = "producto_id"))
	private Set<Producto> productos;

	@ManyToOne
	@JoinColumn(name = "tipoCarrito_id")
	private TipoCarrito tipoCarrito;

	private Integer total;

	private Date fechaCreacion;

	private Date fechaCompra;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	public TipoCarrito getTipoCarrito() {
		return tipoCarrito;
	}

	public void setTipoCarrito(TipoCarrito tipoCarrito) {
		this.tipoCarrito = tipoCarrito;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	
	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
   
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
