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

public class MatiereDAOImpl implements ma.massarpro.dao.MatiereDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(MatiereDAOImpl.class);
	public Matiere loadMatiereByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMatiereByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadMatiereByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere getMatiereByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getMatiereByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getMatiereByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere loadMatiereByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMatiereByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMatiereByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere getMatiereByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getMatiereByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getMatiereByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere loadMatiereByORMID(PersistentSession session, int ID) {
		try {
			return (Matiere) session.load(ma.massarpro.beans.Matiere.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadMatiereByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere getMatiereByORMID(PersistentSession session, int ID) {
		try {
			return (Matiere) session.get(ma.massarpro.beans.Matiere.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getMatiereByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere loadMatiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Matiere) session.load(ma.massarpro.beans.Matiere.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMatiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere getMatiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Matiere) session.get(ma.massarpro.beans.Matiere.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getMatiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere[] listMatiereByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listMatiereByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listMatiereByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere[] listMatiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listMatiereByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listMatiereByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere[] listMatiereByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Matiere as Matiere");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Matiere[]) list.toArray(new Matiere[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMatiereByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere[] listMatiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Matiere as Matiere");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Matiere[]) list.toArray(new Matiere[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMatiereByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere loadMatiereByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMatiereByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadMatiereByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere loadMatiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMatiereByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMatiereByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere loadMatiereByQuery(PersistentSession session, String condition, String orderBy) {
		Matiere[] matieres = listMatiereByQuery(session, condition, orderBy);
		if (matieres != null && matieres.length > 0)
			return matieres[0];
		else
			return null;
	}
	
	public Matiere loadMatiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Matiere[] matieres = listMatiereByQuery(session, condition, orderBy, lockMode);
		if (matieres != null && matieres.length > 0)
			return matieres[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMatiereByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateMatiereByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateMatiereByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateMatiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateMatiereByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateMatiereByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateMatiereByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Matiere as Matiere");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMatiereByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateMatiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Matiere as Matiere");
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
			_logger.error("iterateMatiereByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Matiere createMatiere() {
		return new ma.massarpro.beans.Matiere();
	}
	
	public boolean save(ma.massarpro.beans.Matiere matiere) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(matiere);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Matiere matiere)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Matiere matiere) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(matiere);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Matiere matiere)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Matiere matiere) {
		try {
			ma.massarpro.beans.Classe[] lClassess = matiere.classes.toArray();
			for(int i = 0; i < lClassess.length; i++) {
				lClassess[i].matiere.remove(matiere);
			}
			ma.massarpro.beans.Absence_retard[] lAbsence_retards = matiere.absence_retard.toArray();
			for(int i = 0; i < lAbsence_retards.length; i++) {
				lAbsence_retards[i].setMatiere(null);
			}
			ma.massarpro.beans.Controle[] lControles = matiere.controle.toArray();
			for(int i = 0; i < lControles.length; i++) {
				lControles[i].setMatiere(null);
			}
			return delete(matiere);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Matiere matiere, org.orm.PersistentSession session) {
		try {
			ma.massarpro.beans.Classe[] lClassess = matiere.classes.toArray();
			for(int i = 0; i < lClassess.length; i++) {
				lClassess[i].matiere.remove(matiere);
			}
			ma.massarpro.beans.Absence_retard[] lAbsence_retards = matiere.absence_retard.toArray();
			for(int i = 0; i < lAbsence_retards.length; i++) {
				lAbsence_retards[i].setMatiere(null);
			}
			ma.massarpro.beans.Controle[] lControles = matiere.controle.toArray();
			for(int i = 0; i < lControles.length; i++) {
				lControles[i].setMatiere(null);
			}
			try {
				session.delete(matiere);
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
	
	public boolean refresh(ma.massarpro.beans.Matiere matiere) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(matiere);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Matiere matiere)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Matiere matiere) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(matiere);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Matiere matiere)", e);
			throw new RuntimeException(e);
		}
	}
	
}
