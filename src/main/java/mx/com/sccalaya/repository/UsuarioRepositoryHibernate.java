package mx.com.sccalaya.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sccalaya.model.Usuario;
@Repository
@Transactional
public class UsuarioRepositoryHibernate implements UsuarioRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Usuario findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Usuario found = (Usuario)session.get(Usuario.class, id);
		// TODO Auto-generated method stub
		return found;
	}

}
