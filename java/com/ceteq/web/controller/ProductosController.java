package com.ceteq.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;	
import com.ceteq.model.Producto;
import com.ceteq.service.SistemaProductosService;

@Controller
public class ProductosController {
	@Autowired
	SistemaProductosService service;
	
	@RequestMapping(value="/producto/list",method=RequestMethod.GET)
	ModelAndView listarProductos() {
			ModelAndView mav = new ModelAndView();
			List<Producto> lista = service.findAllProductos();
			mav.addObject("productos",lista);
			mav.setViewName("listar-productos");
			return mav;
	}
	
	@RequestMapping(value="/producto/add",method=RequestMethod.GET)
	ModelAndView agrarProducto() {
			ModelAndView mav = new ModelAndView();
			mav.addObject("producto",new Producto());
			mav.setViewName("agregar-producto");
			return mav;
	}
	
	@RequestMapping(value="/producto/add",method=RequestMethod.POST)
	ModelAndView addProducto(Producto p) {
			ModelAndView mav = new ModelAndView();
			service.createProducto(p);
			mav = listarProductos();
			return mav;
	}
	
	@RequestMapping(value="/producto/update",method=RequestMethod.GET)
	ModelAndView findProducto() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("buscar-producto");
		return mav;
	}
	@RequestMapping(value="/producto/update",method=RequestMethod.POST)
	ModelAndView mostrarProducto(Integer id) {
		ModelAndView mav = new ModelAndView();
		Producto p = service.findProductoById(id);
		mav.addObject("producto",p);
		mav.setViewName("editar-producto");
		return mav;
	}
	@RequestMapping(value="/producto/editar",method=RequestMethod.POST)
	ModelAndView actualizarProducto(Producto p) {
		ModelAndView mav = new ModelAndView();
		service.updateProducto(p);
		mav = listarProductos();
		return mav;
	}
	@RequestMapping(value="/producto/delete",method=RequestMethod.GET)
	ModelAndView findDeleteProducto() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("buscar-producto-eliminar");
		return mav;
	}
	@RequestMapping(value="/producto/delete",method=RequestMethod.POST)
	ModelAndView deleteProducto(Integer id){
		ModelAndView mav = new ModelAndView();
		Producto p = service.findProductoById(id);
		mav.addObject("producto",p);
		mav.setViewName("eliminar-producto");
		return mav;
	}
	@RequestMapping(value="/producto/eliminar",method=RequestMethod.POST)
	ModelAndView elimarProducto(Producto p) {
		ModelAndView mav = new ModelAndView();
		service.deleteProducto(p);
		mav = listarProductos();
		return mav;
	}
	
	
}
