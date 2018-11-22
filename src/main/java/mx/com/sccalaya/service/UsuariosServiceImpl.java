package mx.com.sccalaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sccalaya.model.Usuarios;
import mx.com.sccalaya.repository.UsuarioRepository;
@Service
@Transactional
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuarios findUsuarioById(Integer id) {
		Usuarios found  = usuarioRepository.findById(id);
		return found;
	}
	
//
//	@Transactional
//	public Usuarios findUsuarioById(Integer id) {
//		Usuarios found  = usuarioRepository.findById(id);
//		return found;
//	}

}
