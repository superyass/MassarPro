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

public class NiveauDAOImpl implements ma.massarpro.dao.NiveauDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(NiveauDAOImpl.class);
	public Niveau loadNiveauByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNiveauByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadNiveauByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau getNiveauByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getNiveauByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getNiveauByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau loadNiveauByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNiveauByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadNiveauByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau getNiveauByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getNiveauByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getNiveauByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau loadNiveauByORMID(PersistentSession session, int ID) {
		try {
			return (Niveau) session.load(ma.massarpro.beans.Niveau.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadNiveauByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau getNiveauByORMID(PersistentSession session, int ID) {
		try {
			return (Niveau) session.get(ma.massarpro.beans.Niveau.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getNiveauByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau loadNiveauByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Niveau) session.load(ma.massarpro.beans.Niveau.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadNiveauByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau getNiveauByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Niveau) session.get(ma.massarpro.beans.Niveau.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getNiveauByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau[] listNiveauByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listNiveauByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listNiveauByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau[] listNiveauByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listNiveauByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listNiveauByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau[] listNiveauByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Niveau as Niveau");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Niveau[]) list.toArray(new Niveau[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listNiveauByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau[] listNiveauByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Niveau as Niveau");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Niveau[]) list.toArray(new Niveau[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listNiveauByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau loadNiveauByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNiveauByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadNiveauByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau loadNiveauByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNiveauByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadNiveauByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau loadNiveauByQuery(PersistentSession session, String condition, String orderBy) {
		Niveau[] niveaus = listNiveauByQuery(session, condition, orderBy);
		if (niveaus != null && niveaus.length > 0)
			return niveaus[0];
		else
			return null;
	}
	
	public Niveau loadNiveauByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Niveau[] niveaus = listNiveauByQuery(session, condition, orderBy, lockMode);
		if (niveaus != null && niveaus.length > 0)
			return niveaus[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNiveauByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateNiveauByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateNiveauByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateNiveauByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateNiveauByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateNiveauByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateNiveauByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Niveau as Niveau");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateNiveauByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateNiveauByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Niveau as Niveau");
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
			_logger.error("iterateNiveauByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Niveau createNiveau() {
		return new ma.massarpro.beans.Niveau();
	}
	
	public boolean save(ma.massarpro.beans.Niveau niveau) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(niveau);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Niveau niveau)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Niveau niveau) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(niveau);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Niveau niveau)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Niveau niveau) {
		try {
			ma.massarpro.beans.Administrateur[] lAdministrateurs = niveau.administrateur.toArray();
			for(int i = 0; i < lAdministrateurs.length; i++) {
				lAdministrateurs[i].niveau.remove(niveau);
			}
			ma.massarpro.beans.Classe[] lClasses = niveau.classe.toArray();
			for(int i = 0; i < lClasses.length; i++) {
				lClasses[i].setNiveau(null);
			}
			return delete(niveau);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Niveau niveau, org.orm.PersistentSession session) {
		try {
			ma.massarpro.beans.Administrateur[] lAdministrateurs = niveau.administrateur.toArray();
			for(int i = 0; i < lAdministrateurs.length; i++) {
				lAdministrateurs[i].niveau.remove(niveau);
			}
			ma.massarpro.beans.Classe[] lClasses = niveau.classe.toArray();
			for(int i = 0; i < lClasses.length; i++) {
				lClasses[i].setNiveau(null);
			}
			try {
				session.delete(niveau);
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
	
	public boolean refresh(ma.massarpro.beans.Niveau niveau) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(niveau);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Niveau niveau)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Niveau niveau) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(niveau);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Niveau niveau)", e);
			throw new RuntimeException(e);
		}
	}
	
}
