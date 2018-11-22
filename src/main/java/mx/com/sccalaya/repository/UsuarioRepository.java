package mx.com.sccalaya.repository;

import mx.com.sccalaya.model.Usuarios;

public interface UsuarioRepository {

	Usuarios findById(Integer id);
}
