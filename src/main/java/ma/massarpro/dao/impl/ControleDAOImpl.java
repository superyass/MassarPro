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

public class ControleDAOImpl implements ma.massarpro.dao.ControleDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(ControleDAOImpl.class);
	public Controle loadControleByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadControleByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadControleByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle getControleByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getControleByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getControleByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle loadControleByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadControleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadControleByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle getControleByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getControleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getControleByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle loadControleByORMID(PersistentSession session, int ID) {
		try {
			return (Controle) session.load(ma.massarpro.beans.Controle.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadControleByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle getControleByORMID(PersistentSession session, int ID) {
		try {
			return (Controle) session.get(ma.massarpro.beans.Controle.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getControleByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle loadControleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Controle) session.load(ma.massarpro.beans.Controle.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadControleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle getControleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Controle) session.get(ma.massarpro.beans.Controle.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getControleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle[] listControleByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listControleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listControleByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle[] listControleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listControleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listControleByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle[] listControleByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Controle as Controle");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Controle[]) list.toArray(new Controle[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listControleByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle[] listControleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Controle as Controle");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Controle[]) list.toArray(new Controle[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listControleByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle loadControleByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadControleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadControleByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle loadControleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadControleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadControleByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle loadControleByQuery(PersistentSession session, String condition, String orderBy) {
		Controle[] controles = listControleByQuery(session, condition, orderBy);
		if (controles != null && controles.length > 0)
			return controles[0];
		else
			return null;
	}
	
	public Controle loadControleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Controle[] controles = listControleByQuery(session, condition, orderBy, lockMode);
		if (controles != null && controles.length > 0)
			return controles[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateControleByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateControleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateControleByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateControleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateControleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateControleByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateControleByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Controle as Controle");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateControleByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateControleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Controle as Controle");
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
			_logger.error("iterateControleByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Controle createControle() {
		return new ma.massarpro.beans.Controle();
	}
	
	public boolean save(ma.massarpro.beans.Controle controle) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(controle);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Controle controle)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Controle controle) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(controle);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Controle controle)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Controle controle) {
		try {
			if(controle.getMatiere() != null) {
				controle.getMatiere().controle.remove(controle);
			}
			
			ma.massarpro.beans.Notes[] lNotesss = controle.notess.toArray();
			for(int i = 0; i < lNotesss.length; i++) {
				lNotesss[i].setControle(null);
			}
			return delete(controle);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Controle controle, org.orm.PersistentSession session) {
		try {
			if(controle.getMatiere() != null) {
				controle.getMatiere().controle.remove(controle);
			}
			
			ma.massarpro.beans.Notes[] lNotesss = controle.notess.toArray();
			for(int i = 0; i < lNotesss.length; i++) {
				lNotesss[i].setControle(null);
			}
			try {
				session.delete(controle);
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
	
	public boolean refresh(ma.massarpro.beans.Controle controle) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(controle);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Controle controle)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Controle controle) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(controle);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Controle controle)", e);
			throw new RuntimeException(e);
		}
	}
	
}
