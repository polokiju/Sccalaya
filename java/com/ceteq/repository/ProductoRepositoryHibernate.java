package com.ceteq.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceteq.model.Producto;

@Repository
@Transactional
public class ProductoRepositoryHibernate implements ProductoRepository {

	@Autowired
	SessionFactory sessionFactory;
	public List<Producto> findAll() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("select p from Producto p");
		return query.list();
	}
	@Override
	public void Create(Producto p) {
		Session session = sessionFactory.getCurrentSession();
		session.save(p);
	}
	@Override
	public Producto findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Producto found = (Producto)session.get(Producto.class,id);
		return found;
	}
	@Override
	public void update(Producto p) {
		Session session = sessionFactory.getCurrentSession();
		session.update(p);
	}
	@Override
	public void delete(Producto p) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(p);
	}

}
