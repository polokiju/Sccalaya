package com.ceteq.repository;

import java.util.List;

import com.ceteq.model.Producto;

public interface ProductoRepository {
	
	List<Producto>findAll();
	void Create(Producto p);
	Producto findById(Integer id);
	void update(Producto p);
	void delete(Producto p);
	

}
