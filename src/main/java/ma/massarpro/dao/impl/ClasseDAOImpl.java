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

public class ClasseDAOImpl implements ma.massarpro.dao.ClasseDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(ClasseDAOImpl.class);
	public Classe loadClasseByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadClasseByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadClasseByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe getClasseByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getClasseByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getClasseByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe loadClasseByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadClasseByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadClasseByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe getClasseByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getClasseByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getClasseByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe loadClasseByORMID(PersistentSession session, int ID) {
		try {
			return (Classe) session.load(ma.massarpro.beans.Classe.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadClasseByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe getClasseByORMID(PersistentSession session, int ID) {
		try {
			return (Classe) session.get(ma.massarpro.beans.Classe.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getClasseByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe loadClasseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Classe) session.load(ma.massarpro.beans.Classe.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadClasseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe getClasseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Classe) session.get(ma.massarpro.beans.Classe.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getClasseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe[] listClasseByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listClasseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listClasseByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe[] listClasseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listClasseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listClasseByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe[] listClasseByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Classe as Classe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Classe[]) list.toArray(new Classe[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listClasseByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe[] listClasseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Classe as Classe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Classe[]) list.toArray(new Classe[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listClasseByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe loadClasseByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadClasseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadClasseByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe loadClasseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadClasseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadClasseByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe loadClasseByQuery(PersistentSession session, String condition, String orderBy) {
		Classe[] classes = listClasseByQuery(session, condition, orderBy);
		if (classes != null && classes.length > 0)
			return classes[0];
		else
			return null;
	}
	
	public Classe loadClasseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Classe[] classes = listClasseByQuery(session, condition, orderBy, lockMode);
		if (classes != null && classes.length > 0)
			return classes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClasseByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateClasseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateClasseByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateClasseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateClasseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateClasseByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateClasseByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Classe as Classe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateClasseByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateClasseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Classe as Classe");
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
			_logger.error("iterateClasseByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Classe createClasse() {
		return new ma.massarpro.beans.Classe();
	}
	
	public boolean save(ma.massarpro.beans.Classe classe) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(classe);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Classe classe)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Classe classe) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(classe);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Classe classe)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Classe classe) {
		try {
			if(classe.getNiveau() != null) {
				classe.getNiveau().classe.remove(classe);
			}
			
			ma.massarpro.beans.Etudiant[] lEtudiants = classe.etudiant.toArray();
			for(int i = 0; i < lEtudiants.length; i++) {
				lEtudiants[i].classes.remove(classe);
			}
			ma.massarpro.beans.Professeur[] lProfesseurs = classe.professeur.toArray();
			for(int i = 0; i < lProfesseurs.length; i++) {
				lProfesseurs[i].classe.remove(classe);
			}
			ma.massarpro.beans.Matiere[] lMatieres = classe.matiere.toArray();
			for(int i = 0; i < lMatieres.length; i++) {
				lMatieres[i].classes.remove(classe);
			}
			if(classe.getEmploie() != null) {
				classe.getEmploie().setClasse(null);
			}
			
			ma.massarpro.beans.Support[] lSupports = classe.support.toArray();
			for(int i = 0; i < lSupports.length; i++) {
				lSupports[i].classe.remove(classe);
			}
			return delete(classe);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Classe classe, org.orm.PersistentSession session) {
		try {
			if(classe.getNiveau() != null) {
				classe.getNiveau().classe.remove(classe);
			}
			
			ma.massarpro.beans.Etudiant[] lEtudiants = classe.etudiant.toArray();
			for(int i = 0; i < lEtudiants.length; i++) {
				lEtudiants[i].classes.remove(classe);
			}
			ma.massarpro.beans.Professeur[] lProfesseurs = classe.professeur.toArray();
			for(int i = 0; i < lProfesseurs.length; i++) {
				lProfesseurs[i].classe.remove(classe);
			}
			ma.massarpro.beans.Matiere[] lMatieres = classe.matiere.toArray();
			for(int i = 0; i < lMatieres.length; i++) {
				lMatieres[i].classes.remove(classe);
			}
			if(classe.getEmploie() != null) {
				classe.getEmploie().setClasse(null);
			}
			
			ma.massarpro.beans.Support[] lSupports = classe.support.toArray();
			for(int i = 0; i < lSupports.length; i++) {
				lSupports[i].classe.remove(classe);
			}
			try {
				session.delete(classe);
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
	
	public boolean refresh(ma.massarpro.beans.Classe classe) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(classe);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Classe classe)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Classe classe) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(classe);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Classe classe)", e);
			throw new RuntimeException(e);
		}
	}
	
}
