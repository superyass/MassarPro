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

public class EmploieDAOImpl implements ma.massarpro.dao.EmploieDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(EmploieDAOImpl.class);
	public Emploie loadEmploieByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEmploieByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadEmploieByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie getEmploieByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getEmploieByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getEmploieByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie loadEmploieByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEmploieByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEmploieByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie getEmploieByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getEmploieByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getEmploieByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie loadEmploieByORMID(PersistentSession session, int ID) {
		try {
			return (Emploie) session.load(ma.massarpro.beans.Emploie.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadEmploieByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie getEmploieByORMID(PersistentSession session, int ID) {
		try {
			return (Emploie) session.get(ma.massarpro.beans.Emploie.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getEmploieByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie loadEmploieByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Emploie) session.load(ma.massarpro.beans.Emploie.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEmploieByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie getEmploieByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Emploie) session.get(ma.massarpro.beans.Emploie.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getEmploieByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie[] listEmploieByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listEmploieByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listEmploieByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie[] listEmploieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listEmploieByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listEmploieByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie[] listEmploieByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Emploie as Emploie");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Emploie[]) list.toArray(new Emploie[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEmploieByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie[] listEmploieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Emploie as Emploie");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Emploie[]) list.toArray(new Emploie[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEmploieByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie loadEmploieByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEmploieByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadEmploieByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie loadEmploieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEmploieByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEmploieByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie loadEmploieByQuery(PersistentSession session, String condition, String orderBy) {
		Emploie[] emploies = listEmploieByQuery(session, condition, orderBy);
		if (emploies != null && emploies.length > 0)
			return emploies[0];
		else
			return null;
	}
	
	public Emploie loadEmploieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Emploie[] emploies = listEmploieByQuery(session, condition, orderBy, lockMode);
		if (emploies != null && emploies.length > 0)
			return emploies[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmploieByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateEmploieByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateEmploieByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEmploieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateEmploieByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateEmploieByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEmploieByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Emploie as Emploie");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEmploieByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEmploieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Emploie as Emploie");
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
			_logger.error("iterateEmploieByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Emploie createEmploie() {
		return new ma.massarpro.beans.Emploie();
	}
	
	public boolean save(ma.massarpro.beans.Emploie emploie) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(emploie);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Emploie emploie)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Emploie emploie) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(emploie);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Emploie emploie)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Emploie emploie) {
		try {
			if(emploie.getClasse() != null) {
				emploie.getClasse().setEmploie(null);
			}
			
			return delete(emploie);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Emploie emploie, org.orm.PersistentSession session) {
		try {
			if(emploie.getClasse() != null) {
				emploie.getClasse().setEmploie(null);
			}
			
			try {
				session.delete(emploie);
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
	
	public boolean refresh(ma.massarpro.beans.Emploie emploie) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(emploie);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Emploie emploie)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Emploie emploie) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(emploie);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Emploie emploie)", e);
			throw new RuntimeException(e);
		}
	}
	
}
