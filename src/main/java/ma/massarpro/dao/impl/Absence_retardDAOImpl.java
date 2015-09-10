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

import java.util.List;

import ma.massarpro.beans.Absence_retard;

import org.hibernate.Query;
import org.orm.PersistentSession;

public class Absence_retardDAOImpl implements ma.massarpro.dao.Absence_retardDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(Absence_retardDAOImpl.class);
	public Absence_retard loadAbsence_retardByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAbsence_retardByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadAbsence_retardByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard getAbsence_retardByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getAbsence_retardByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getAbsence_retardByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard loadAbsence_retardByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAbsence_retardByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadAbsence_retardByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard getAbsence_retardByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getAbsence_retardByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getAbsence_retardByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard loadAbsence_retardByORMID(PersistentSession session, int ID) {
		try {
			return (Absence_retard) session.load(ma.massarpro.beans.Absence_retard.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadAbsence_retardByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard getAbsence_retardByORMID(PersistentSession session, int ID) {
		try {
			return (Absence_retard) session.get(ma.massarpro.beans.Absence_retard.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getAbsence_retardByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard loadAbsence_retardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Absence_retard) session.load(ma.massarpro.beans.Absence_retard.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadAbsence_retardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard getAbsence_retardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Absence_retard) session.get(ma.massarpro.beans.Absence_retard.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getAbsence_retardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public List<Absence_retard> listAbsence_retardByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listAbsence_retardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listAbsence_retardByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard[] listAbsence_retardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listAbsence_retardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listAbsence_retardByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public List<Absence_retard> listAbsence_retardByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Absence_retard as Absence_retard");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List<Absence_retard> list = query.list();
			return list;
		}
		catch (Exception e) {
			_logger.error("listAbsence_retardByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard[] listAbsence_retardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Absence_retard as Absence_retard");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Absence_retard[]) list.toArray(new Absence_retard[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listAbsence_retardByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard loadAbsence_retardByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAbsence_retardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadAbsence_retardByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard loadAbsence_retardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadAbsence_retardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadAbsence_retardByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard loadAbsence_retardByQuery(PersistentSession session, String condition, String orderBy) {
		List<Absence_retard> absence_retards = listAbsence_retardByQuery(session, condition, orderBy);
		if (absence_retards != null && absence_retards.size() > 0)
			return absence_retards.get(0);
		else
			return null;
	}
	
	public Absence_retard loadAbsence_retardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Absence_retard[] absence_retards = listAbsence_retardByQuery(session, condition, orderBy, lockMode);
		if (absence_retards != null && absence_retards.length > 0)
			return absence_retards[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAbsence_retardByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateAbsence_retardByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateAbsence_retardByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateAbsence_retardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateAbsence_retardByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateAbsence_retardByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateAbsence_retardByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Absence_retard as Absence_retard");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateAbsence_retardByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateAbsence_retardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Absence_retard as Absence_retard");
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
			_logger.error("iterateAbsence_retardByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Absence_retard createAbsence_retard() {
		return new ma.massarpro.beans.Absence_retard();
	}
	
	public boolean save(ma.massarpro.beans.Absence_retard absence_retard) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(absence_retard);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Absence_retard absence_retard)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Absence_retard absence_retard) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(absence_retard);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Absence_retard absence_retard)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Absence_retard absence_retard) {
		try {
			if(absence_retard.getMatiere() != null) {
				absence_retard.getMatiere().absence_retard.remove(absence_retard);
			}
			
			return delete(absence_retard);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Absence_retard absence_retard, org.orm.PersistentSession session) {
		try {
			if(absence_retard.getMatiere() != null) {
				absence_retard.getMatiere().absence_retard.remove(absence_retard);
			}
			
			try {
				session.delete(absence_retard);
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
	
	public boolean refresh(ma.massarpro.beans.Absence_retard absence_retard) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(absence_retard);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Absence_retard absence_retard)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Absence_retard absence_retard) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(absence_retard);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Absence_retard absence_retard)", e);
			throw new RuntimeException(e);
		}
	}
	
}
