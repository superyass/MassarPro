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

public class EtudiantDAOImpl implements ma.massarpro.dao.EtudiantDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(EtudiantDAOImpl.class);
	public Etudiant loadEtudiantByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEtudiantByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadEtudiantByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant getEtudiantByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getEtudiantByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getEtudiantByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant loadEtudiantByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEtudiantByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEtudiantByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant getEtudiantByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getEtudiantByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getEtudiantByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant loadEtudiantByORMID(PersistentSession session, int ID) {
		try {
			return (Etudiant) session.load(ma.massarpro.beans.Etudiant.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadEtudiantByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant getEtudiantByORMID(PersistentSession session, int ID) {
		try {
			return (Etudiant) session.get(ma.massarpro.beans.Etudiant.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getEtudiantByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant loadEtudiantByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Etudiant) session.load(ma.massarpro.beans.Etudiant.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEtudiantByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant getEtudiantByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Etudiant) session.get(ma.massarpro.beans.Etudiant.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getEtudiantByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant[] listEtudiantByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listEtudiantByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listEtudiantByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant[] listEtudiantByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listEtudiantByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listEtudiantByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant[] listEtudiantByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Etudiant as Etudiant");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Etudiant[]) list.toArray(new Etudiant[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEtudiantByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant[] listEtudiantByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Etudiant as Etudiant");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Etudiant[]) list.toArray(new Etudiant[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listEtudiantByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant loadEtudiantByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEtudiantByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadEtudiantByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant loadEtudiantByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadEtudiantByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadEtudiantByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant loadEtudiantByQuery(PersistentSession session, String condition, String orderBy) {
		Etudiant[] etudiants = listEtudiantByQuery(session, condition, orderBy);
		if (etudiants != null && etudiants.length > 0)
			return etudiants[0];
		else
			return null;
	}
	
	public Etudiant loadEtudiantByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Etudiant[] etudiants = listEtudiantByQuery(session, condition, orderBy, lockMode);
		if (etudiants != null && etudiants.length > 0)
			return etudiants[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEtudiantByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateEtudiantByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateEtudiantByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEtudiantByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateEtudiantByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateEtudiantByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEtudiantByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Etudiant as Etudiant");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateEtudiantByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateEtudiantByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Etudiant as Etudiant");
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
			_logger.error("iterateEtudiantByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Etudiant createEtudiant() {
		return new ma.massarpro.beans.Etudiant();
	}
	
	public boolean save(ma.massarpro.beans.Etudiant etudiant) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(etudiant);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Etudiant etudiant)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Etudiant etudiant) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(etudiant);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Etudiant etudiant)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Etudiant etudiant) {
		try {
			if(etudiant.getParent() != null) {
				etudiant.getParent().etudiant.remove(etudiant);
			}
			
			ma.massarpro.beans.Classe[] lClassess = etudiant.classes.toArray();
			for(int i = 0; i < lClassess.length; i++) {
				lClassess[i].etudiant.remove(etudiant);
			}
			ma.massarpro.beans.Notes[] lNotesss = etudiant.notes.toArray();
			for(int i = 0; i < lNotesss.length; i++) {
				lNotesss[i].setEtudiant(null);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = etudiant.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(etudiant);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = etudiant.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			return delete(etudiant);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Etudiant etudiant, org.orm.PersistentSession session) {
		try {
			if(etudiant.getParent() != null) {
				etudiant.getParent().etudiant.remove(etudiant);
			}
			
			ma.massarpro.beans.Classe[] lClassess = etudiant.classes.toArray();
			for(int i = 0; i < lClassess.length; i++) {
				lClassess[i].etudiant.remove(etudiant);
			}
			ma.massarpro.beans.Notes[] lNotesss = etudiant.notes.toArray();
			for(int i = 0; i < lNotesss.length; i++) {
				lNotesss[i].setEtudiant(null);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = etudiant.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(etudiant);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = etudiant.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			try {
				session.delete(etudiant);
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
	
	public boolean refresh(ma.massarpro.beans.Etudiant etudiant) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(etudiant);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Etudiant etudiant)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Etudiant etudiant) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(etudiant);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Etudiant etudiant)", e);
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Etudiant> listEtudiant() {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			Query query = session.createQuery("From ma.massarpro.beans.Etudiant as Etudiant");
			List<Etudiant> list = query.list();
			return list;
		}
		catch (Exception e) {
			_logger.error("listEtudiantByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
}
