package com.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate.model.Ciudad;
import com.hibernate.util.HibernateUtil;

public class CiudadDAO {

	public void insertCiudad(Ciudad c) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(c);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	public void updateCiudad(Ciudad c) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.merge(c);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	public void deleteCiudad(int id) {
		Transaction transaction = null;
		Ciudad c = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			c = session.get(Ciudad.class, id);
			session.remove(c);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	public List<Ciudad> selectAllCiudad() {
		Transaction transaction = null;
		List<Ciudad> ciudades = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			ciudades = session.createQuery("FROM Ciudad", Ciudad.class).getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return ciudades;
	}

	public Ciudad selectCiudadById(int id) {
		Transaction transaction = null;
		Ciudad c = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			c = session.get(Ciudad.class, id);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return c;
	}

	
	public List<Ciudad> selectAllCiudadMillon() {
		Transaction transaction = null;
		List<Ciudad> ciudades = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			ciudades = session.createQuery("FROM Ciudad WHERE habitante > 1000000", Ciudad.class).getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return ciudades;
	}
	
	public List<Ciudad> selectAllCiudadHabitantes(int habitantesUsuario) {
		Transaction transaction = null;
		List<Ciudad> ciudades = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Query<Ciudad> query=session.createQuery("FROM Ciudad WHERE habitante < :habitantesParam",Ciudad.class);
			query.setParameter("habitantesParam", habitantesUsuario);
			ciudades=query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return ciudades;
	}
	
	
	public List<Ciudad> selectAllCiudadNombre(String nombreUsuario) {
		Transaction transaction = null;
		List<Ciudad> ciudades = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Query<Ciudad> query=session.createQuery("FROM Ciudad WHERE nombre = :nombreParam",Ciudad.class);
			query.setParameter("nombreParam", nombreUsuario);
			ciudades=query.getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return ciudades;
	}
	
	
}
