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

public class SupportDAOImpl implements ma.massarpro.dao.SupportDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(SupportDAOImpl.class);
	public Support loadSupportByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadSupportByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSupportByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support getSupportByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getSupportByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSupportByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support loadSupportByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadSupportByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSupportByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support getSupportByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getSupportByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSupportByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support loadSupportByORMID(PersistentSession session, int ID) {
		try {
			return (Support) session.load(ma.massarpro.beans.Support.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSupportByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support getSupportByORMID(PersistentSession session, int ID) {
		try {
			return (Support) session.get(ma.massarpro.beans.Support.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSupportByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support loadSupportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Support) session.load(ma.massarpro.beans.Support.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSupportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support getSupportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Support) session.get(ma.massarpro.beans.Support.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSupportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support[] listSupportByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listSupportByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSupportByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support[] listSupportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listSupportByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSupportByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support[] listSupportByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Support as Support");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Support[]) list.toArray(new Support[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSupportByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support[] listSupportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Support as Support");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Support[]) list.toArray(new Support[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSupportByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support loadSupportByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadSupportByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSupportByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support loadSupportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadSupportByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSupportByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support loadSupportByQuery(PersistentSession session, String condition, String orderBy) {
		Support[] supports = listSupportByQuery(session, condition, orderBy);
		if (supports != null && supports.length > 0)
			return supports[0];
		else
			return null;
	}
	
	public Support loadSupportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Support[] supports = listSupportByQuery(session, condition, orderBy, lockMode);
		if (supports != null && supports.length > 0)
			return supports[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSupportByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateSupportByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSupportByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateSupportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateSupportByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSupportByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateSupportByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Support as Support");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSupportByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateSupportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Support as Support");
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
			_logger.error("iterateSupportByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Support createSupport() {
		return new ma.massarpro.beans.Support();
	}
	
	public boolean save(ma.massarpro.beans.Support support) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(support);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Support support)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Support support) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(support);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Support support)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Support support) {
		try {
			if(support.getProfesseur() != null) {
				support.getProfesseur().support.remove(support);
			}
			
			ma.massarpro.beans.Classe[] lClasses = support.classe.toArray();
			for(int i = 0; i < lClasses.length; i++) {
				lClasses[i].support.remove(support);
			}
			return delete(support);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Support support, org.orm.PersistentSession session) {
		try {
			if(support.getProfesseur() != null) {
				support.getProfesseur().support.remove(support);
			}
			
			ma.massarpro.beans.Classe[] lClasses = support.classe.toArray();
			for(int i = 0; i < lClasses.length; i++) {
				lClasses[i].support.remove(support);
			}
			try {
				session.delete(support);
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
	
	public boolean refresh(ma.massarpro.beans.Support support) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(support);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Support support)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Support support) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(support);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Support support)", e);
			throw new RuntimeException(e);
		}
	}
	
}
