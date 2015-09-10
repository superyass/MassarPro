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

public class ParentDAOImpl implements ma.massarpro.dao.ParentDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(ParentDAOImpl.class);
	public Parent loadParentByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadParentByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadParentByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent getParentByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getParentByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getParentByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent loadParentByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadParentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadParentByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent getParentByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getParentByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getParentByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent loadParentByORMID(PersistentSession session, int ID) {
		try {
			return (Parent) session.load(ma.massarpro.beans.Parent.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadParentByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent getParentByORMID(PersistentSession session, int ID) {
		try {
			return (Parent) session.get(ma.massarpro.beans.Parent.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getParentByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent loadParentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Parent) session.load(ma.massarpro.beans.Parent.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadParentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent getParentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Parent) session.get(ma.massarpro.beans.Parent.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getParentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent[] listParentByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listParentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listParentByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent[] listParentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listParentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listParentByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent[] listParentByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Parent as Parent");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Parent[]) list.toArray(new Parent[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listParentByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent[] listParentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Parent as Parent");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Parent[]) list.toArray(new Parent[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listParentByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent loadParentByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadParentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadParentByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent loadParentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadParentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadParentByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent loadParentByQuery(PersistentSession session, String condition, String orderBy) {
		Parent[] parents = listParentByQuery(session, condition, orderBy);
		if (parents != null && parents.length > 0)
			return parents[0];
		else
			return null;
	}
	
	public Parent loadParentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Parent[] parents = listParentByQuery(session, condition, orderBy, lockMode);
		if (parents != null && parents.length > 0)
			return parents[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateParentByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateParentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateParentByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateParentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateParentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateParentByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateParentByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Parent as Parent");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateParentByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateParentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Parent as Parent");
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
			_logger.error("iterateParentByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Parent createParent() {
		return new ma.massarpro.beans.Parent();
	}
	
	public boolean save(ma.massarpro.beans.Parent parent) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(parent);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Parent parent)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Parent parent) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(parent);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Parent parent)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Parent parent) {
		try {
			ma.massarpro.beans.Etudiant[] lEtudiants = parent.etudiant.toArray();
			for(int i = 0; i < lEtudiants.length; i++) {
				lEtudiants[i].setParent(null);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = parent.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(parent);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = parent.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			return delete(parent);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Parent parent, org.orm.PersistentSession session) {
		try {
			ma.massarpro.beans.Etudiant[] lEtudiants = parent.etudiant.toArray();
			for(int i = 0; i < lEtudiants.length; i++) {
				lEtudiants[i].setParent(null);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = parent.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(parent);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = parent.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			try {
				session.delete(parent);
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
	
	public boolean refresh(ma.massarpro.beans.Parent parent) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(parent);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Parent parent)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Parent parent) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(parent);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Parent parent)", e);
			throw new RuntimeException(e);
		}
	}
	
}
