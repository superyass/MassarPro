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

public class AdministrateurDAOImpl implements ma.massarpro.dao.AdministrateurDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(AdministrateurDAOImpl.class);
	public Administrateur loadAdministrateurByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAdministrateurByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadAdministrateurByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur getAdministrateurByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getAdministrateurByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getAdministrateurByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur loadAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAdministrateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur getAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getAdministrateurByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur loadAdministrateurByORMID(PersistentSession session, int ID) {
		try {
			return (Administrateur) session.load(ma.massarpro.beans.Administrateur.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadAdministrateurByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur getAdministrateurByORMID(PersistentSession session, int ID) {
		try {
			return (Administrateur) session.get(ma.massarpro.beans.Administrateur.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getAdministrateurByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur loadAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Administrateur) session.load(ma.massarpro.beans.Administrateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur getAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Administrateur) session.get(ma.massarpro.beans.Administrateur.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur[] listAdministrateurByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listAdministrateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listAdministrateurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur[] listAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listAdministrateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listAdministrateurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur[] listAdministrateurByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Administrateur as Administrateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Administrateur[]) list.toArray(new Administrateur[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listAdministrateurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur[] listAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Administrateur as Administrateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Administrateur[]) list.toArray(new Administrateur[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listAdministrateurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur loadAdministrateurByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAdministrateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadAdministrateurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur loadAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAdministrateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadAdministrateurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur loadAdministrateurByQuery(PersistentSession session, String condition, String orderBy) {
		Administrateur[] administrateurs = listAdministrateurByQuery(session, condition, orderBy);
		if (administrateurs != null && administrateurs.length > 0)
			return administrateurs[0];
		else
			return null;
	}
	
	public Administrateur loadAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Administrateur[] administrateurs = listAdministrateurByQuery(session, condition, orderBy, lockMode);
		if (administrateurs != null && administrateurs.length > 0)
			return administrateurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministrateurByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateAdministrateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateAdministrateurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateAdministrateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateAdministrateurByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrateurByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Administrateur as Administrateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateAdministrateurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Administrateur as Administrateur");
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
			_logger.error("iterateAdministrateurByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Administrateur createAdministrateur() {
		return new ma.massarpro.beans.Administrateur();
	}
	
	public boolean save(ma.massarpro.beans.Administrateur administrateur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(administrateur);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Administrateur administrateur)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Administrateur administrateur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(administrateur);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Administrateur administrateur)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Administrateur administrateur) {
		try {
			ma.massarpro.beans.Niveau[] lNiveaus = administrateur.niveau.toArray();
			for(int i = 0; i < lNiveaus.length; i++) {
				lNiveaus[i].administrateur.remove(administrateur);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = administrateur.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(administrateur);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = administrateur.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			return delete(administrateur);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Administrateur administrateur, org.orm.PersistentSession session) {
		try {
			ma.massarpro.beans.Niveau[] lNiveaus = administrateur.niveau.toArray();
			for(int i = 0; i < lNiveaus.length; i++) {
				lNiveaus[i].administrateur.remove(administrateur);
			}
			ma.massarpro.beans.Message[] lMessages_recuss = administrateur.messages_recus.toArray();
			for(int i = 0; i < lMessages_recuss.length; i++) {
				lMessages_recuss[i].personnes.remove(administrateur);
			}
			ma.massarpro.beans.Message[] lMessages_envoyéss = administrateur.messages_envoyés.toArray();
			for(int i = 0; i < lMessages_envoyéss.length; i++) {
				lMessages_envoyéss[i].setPersonne(null);
			}
			try {
				session.delete(administrateur);
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
	
	public boolean refresh(ma.massarpro.beans.Administrateur administrateur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(administrateur);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Administrateur administrateur)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Administrateur administrateur) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(administrateur);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Administrateur administrateur)", e);
			throw new RuntimeException(e);
		}
	}
	
}
