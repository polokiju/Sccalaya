package mx.com.sccalaya.repository;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.com.sccalaya.model.Usuarios;
@Repository
@Transactional
public class UsuarioRepositoryHibernate implements UsuarioRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public Usuarios findById(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		Usuarios found = (Usuarios)session.get(Usuarios.class, id);
		// TODO Auto-generated method stub
		System.out.println(found.getNombre().toString());
		return found;
	}

}
