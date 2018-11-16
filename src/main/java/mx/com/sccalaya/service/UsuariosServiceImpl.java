package mx.com.sccalaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sccalaya.model.Usuario;
import mx.com.sccalaya.repository.UsuarioRepository;
@Service
@Transactional
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario findUsuarioById(Integer id) {
		Usuario found  = usuarioRepository.findById(id);
		return found;
	}

}
