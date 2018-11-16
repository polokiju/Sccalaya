package com.ceteq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ceteq.model.Producto;
import com.ceteq.repository.ProductoRepository;

@Service
@Transactional
public class SistemaProductosServiceImpl implements SistemaProductosService {

	@Autowired
	ProductoRepository productoRepo;
	public List<Producto> findAllProductos() {
		List<Producto> lista = productoRepo.findAll();
		return lista;
	}
	@Override
	public Integer createProducto(Producto p) {
		productoRepo.Create(p);
		return p.getId();
	}
	@Override
	public Producto findProductoById(Integer id) {
		Producto found = productoRepo.findById(id);
		return found;
	}
	@Override
	public void updateProducto(Producto p) {
		productoRepo.update(p);
	}
	@Override
	public void deleteProducto(Producto p) {
		productoRepo.delete(p);
	}
	
	

}
