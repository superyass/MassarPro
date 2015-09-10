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

public class NotesDAOImpl implements ma.massarpro.dao.NotesDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(NotesDAOImpl.class);
	public Notes loadNotesByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNotesByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadNotesByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes getNotesByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getNotesByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getNotesByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes loadNotesByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNotesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadNotesByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes getNotesByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getNotesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getNotesByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes loadNotesByORMID(PersistentSession session, int ID) {
		try {
			return (Notes) session.load(ma.massarpro.beans.Notes.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadNotesByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes getNotesByORMID(PersistentSession session, int ID) {
		try {
			return (Notes) session.get(ma.massarpro.beans.Notes.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getNotesByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes loadNotesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Notes) session.load(ma.massarpro.beans.Notes.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadNotesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes getNotesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Notes) session.get(ma.massarpro.beans.Notes.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getNotesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes[] listNotesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listNotesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listNotesByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes[] listNotesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listNotesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listNotesByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes[] listNotesByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Notes as Notes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Notes[]) list.toArray(new Notes[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listNotesByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes[] listNotesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Notes as Notes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Notes[]) list.toArray(new Notes[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listNotesByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes loadNotesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNotesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadNotesByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes loadNotesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadNotesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadNotesByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes loadNotesByQuery(PersistentSession session, String condition, String orderBy) {
		Notes[] noteses = listNotesByQuery(session, condition, orderBy);
		if (noteses != null && noteses.length > 0)
			return noteses[0];
		else
			return null;
	}
	
	public Notes loadNotesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Notes[] noteses = listNotesByQuery(session, condition, orderBy, lockMode);
		if (noteses != null && noteses.length > 0)
			return noteses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateNotesByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateNotesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateNotesByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateNotesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateNotesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateNotesByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateNotesByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Notes as Notes");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateNotesByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateNotesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Notes as Notes");
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
			_logger.error("iterateNotesByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Notes createNotes() {
		return new ma.massarpro.beans.Notes();
	}
	
	public boolean save(ma.massarpro.beans.Notes notes) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(notes);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Notes notes)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Notes notes) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(notes);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Notes notes)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Notes notes) {
		try {
			if(notes.getControle() != null) {
				notes.getControle().notess.remove(notes);
			}
			
			if(notes.getEtudiant() != null) {
				notes.getEtudiant().notes.remove(notes);
			}
			
			return delete(notes);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Notes notes, org.orm.PersistentSession session) {
		try {
			if(notes.getControle() != null) {
				notes.getControle().notess.remove(notes);
			}
			
			if(notes.getEtudiant() != null) {
				notes.getEtudiant().notes.remove(notes);
			}
			
			try {
				session.delete(notes);
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
	
	public boolean refresh(ma.massarpro.beans.Notes notes) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(notes);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Notes notes)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Notes notes) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(notes);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Notes notes)", e);
			throw new RuntimeException(e);
		}
	}
	
}
