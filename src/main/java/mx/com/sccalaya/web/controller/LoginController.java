package mx.com.sccalaya.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mx.com.sccalaya.model.Usuarios;
import mx.com.sccalaya.service.UsuariosService;

@Controller
public class LoginController {
	
	@Autowired
	UsuariosService service;
	@RequestMapping(value="/",method=RequestMethod.GET)
	ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping(value="/searchUser",method=RequestMethod.POST)
	ModelAndView buscarUsuario(Integer id) {
		ModelAndView mav = new ModelAndView();
		Usuarios usuario = service.findUsuarioById(id);
		mav.addObject("usuario",usuario);
		mav.setViewName("logeado");
		return mav;
	}
}
