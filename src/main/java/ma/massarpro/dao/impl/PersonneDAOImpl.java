/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: ROOT
 * License Type: Purchased
 */
package ma.massarpro.dao.impl;

import org.orm.*;
import org.hibernate.Query;

import java.util.List;

import ma.massarpro.beans.*;

public class PersonneDAOImpl implements ma.massarpro.dao.PersonneDAO {
	
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(PersonneDAOImpl.class);
	
	public Personne loadPersonneByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadPersonneByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadPersonneByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne getPersonneByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getPersonneByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getPersonneByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne loadPersonneByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadPersonneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonneByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne getPersonneByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getPersonneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonneByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne loadPersonneByORMID(PersistentSession session, int ID) {
		try {
			return (Personne) session.load(ma.massarpro.beans.Personne.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadPersonneByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne getPersonneByORMID(PersistentSession session, int ID) {
		try {
			return (Personne) session.get(ma.massarpro.beans.Personne.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getPersonneByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne loadPersonneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Personne) session.load(ma.massarpro.beans.Personne.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne getPersonneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Personne) session.get(ma.massarpro.beans.Personne.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getPersonneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne[] listPersonneByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listPersonneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listPersonneByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne[] listPersonneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listPersonneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listPersonneByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne[] listPersonneByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Personne as Personne");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Personne[]) list.toArray(new Personne[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonneByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne[] listPersonneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Personne as Personne");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Personne[]) list.toArray(new Personne[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listPersonneByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne loadPersonneByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadPersonneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadPersonneByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne loadPersonneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadPersonneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadPersonneByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne loadPersonneByQuery(PersistentSession session, String condition, String orderBy) {
		Personne[] personnes = listPersonneByQuery(session, condition, orderBy);
		if (personnes != null && personnes.length > 0)
			return personnes[0];
		else
			return null;
	}
	
	public Personne loadPersonneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Personne[] personnes = listPersonneByQuery(session, condition, orderBy, lockMode);
		if (personnes != null && personnes.length > 0)
			return personnes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonneByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iteratePersonneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iteratePersonneByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iteratePersonneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iteratePersonneByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonneByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Personne as Personne");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePersonneByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Personne as Personne");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iteratePersonneByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Personne createPersonne() {
		return new ma.massarpro.beans.Personne();
	}
	
	public boolean save(ma.massarpro.beans.Personne personne) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(personne);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Personne personne)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Personne personne) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(personne);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Personne personne)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Personne personne) {
		try {
			ma.massarpro.beans.Message[] lMessages_recuss = personne.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(personne);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = personne.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			return delete(personne);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Personne personne, org.orm.PersistentSession session) {
		try {
			ma.massarpro.beans.Message[] lMessages_recuss = personne.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(personne);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = personne.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			try {
				session.delete(personne);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean refresh(ma.massarpro.beans.Personne personne) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(personne);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Personne personne)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Personne personne) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(personne);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Personne personne)", e);
			throw new RuntimeException(e);
		}
	}
	
}
