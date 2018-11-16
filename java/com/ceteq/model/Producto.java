package com.ceteq.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class Producto {
	@Id
	@Column(name="ID")
	@SequenceGenerator(name="producto_seq",sequenceName="producto_sequence",allocationSize=1)
	private Integer id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="PRECIO_UNITARIO")
	private BigDecimal precioUnitario;
	@Column(name="UNIDADES_EN_STOCK")
	private Integer unidadesEnStock;
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Integer getUnidadesEnStock() {
		return unidadesEnStock;
	}
	public void setUnidadesEnStock(Integer unidadesEnStock) {
		this.unidadesEnStock = unidadesEnStock;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
