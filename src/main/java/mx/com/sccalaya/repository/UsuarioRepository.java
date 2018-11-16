package mx.com.sccalaya.repository;

import mx.com.sccalaya.model.Usuario;

public interface UsuarioRepository {

	Usuario findById(Integer id);
}
