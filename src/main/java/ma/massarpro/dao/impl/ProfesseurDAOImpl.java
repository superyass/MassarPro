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

public class ProfesseurDAOImpl implements ma.massarpro.dao.ProfesseurDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(ProfesseurDAOImpl.class);
	public Professeur loadProfesseurByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadProfesseurByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadProfesseurByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur getProfesseurByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getProfesseurByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getProfesseurByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur loadProfesseurByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadProfesseurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProfesseurByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur getProfesseurByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getProfesseurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getProfesseurByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur loadProfesseurByORMID(PersistentSession session, int ID) {
		try {
			return (Professeur) session.load(ma.massarpro.beans.Professeur.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadProfesseurByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur getProfesseurByORMID(PersistentSession session, int ID) {
		try {
			return (Professeur) session.get(ma.massarpro.beans.Professeur.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getProfesseurByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur loadProfesseurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Professeur) session.load(ma.massarpro.beans.Professeur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProfesseurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur getProfesseurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Professeur) session.get(ma.massarpro.beans.Professeur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getProfesseurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur[] listProfesseurByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listProfesseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listProfesseurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur[] listProfesseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listProfesseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listProfesseurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur[] listProfesseurByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Professeur as Professeur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Professeur[]) list.toArray(new Professeur[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProfesseurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur[] listProfesseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Professeur as Professeur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Professeur[]) list.toArray(new Professeur[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProfesseurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur loadProfesseurByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadProfesseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadProfesseurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur loadProfesseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadProfesseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProfesseurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur loadProfesseurByQuery(PersistentSession session, String condition, String orderBy) {
		Professeur[] professeurs = listProfesseurByQuery(session, condition, orderBy);
		if (professeurs != null && professeurs.length > 0)
			return professeurs[0];
		else
			return null;
	}
	
	public Professeur loadProfesseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Professeur[] professeurs = listProfesseurByQuery(session, condition, orderBy, lockMode);
		if (professeurs != null && professeurs.length > 0)
			return professeurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProfesseurByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateProfesseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateProfesseurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateProfesseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateProfesseurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesseurByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Professeur as Professeur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateProfesseurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateProfesseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Professeur as Professeur");
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
			_logger.error("iterateProfesseurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Professeur createProfesseur() {
		return new ma.massarpro.beans.Professeur();
	}
	
	public boolean save(ma.massarpro.beans.Professeur professeur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(professeur);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Professeur professeur)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Professeur professeur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(professeur);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Professeur professeur)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Professeur professeur) {
		try {
			ma.massarpro.beans.Classe[] lClasses = professeur.classe.toArray();
			for(int i = 0; i < lClasses.length; i++) {
				lClasses[i].professeur.remove(professeur);
			}
			ma.massarpro.beans.Support[] lSupports = professeur.support.toArray();
			for(int i = 0; i < lSupports.length; i++) {
				lSupports[i].setProfesseur(null);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = professeur.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(professeur);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = professeur.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			return delete(professeur);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Professeur professeur, org.orm.PersistentSession session) {
		try {
			ma.massarpro.beans.Classe[] lClasses = professeur.classe.toArray();
			for(int i = 0; i < lClasses.length; i++) {
				lClasses[i].professeur.remove(professeur);
			}
			ma.massarpro.beans.Support[] lSupports = professeur.support.toArray();
			for(int i = 0; i < lSupports.length; i++) {
				lSupports[i].setProfesseur(null);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = professeur.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(professeur);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = professeur.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			try {
				session.delete(professeur);
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
	
	public boolean refresh(ma.massarpro.beans.Professeur professeur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(professeur);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Professeur professeur)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Professeur professeur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(professeur);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Professeur professeur)", e);
			throw new RuntimeException(e);
		}
	}
	
}
