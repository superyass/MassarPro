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

public class MessageDAOImpl implements ma.massarpro.dao.MessageDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(MessageDAOImpl.class);
	public Message loadMessageByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMessageByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadMessageByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message getMessageByORMID(int ID) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getMessageByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getMessageByORMID(int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message loadMessageByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMessageByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMessageByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message getMessageByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return getMessageByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getMessageByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message loadMessageByORMID(PersistentSession session, int ID) {
		try {
			return (Message) session.load(ma.massarpro.beans.Message.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadMessageByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message getMessageByORMID(PersistentSession session, int ID) {
		try {
			return (Message) session.get(ma.massarpro.beans.Message.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getMessageByORMID(PersistentSession session, int ID)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message loadMessageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Message) session.load(ma.massarpro.beans.Message.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMessageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message getMessageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (Message) session.get(ma.massarpro.beans.Message.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getMessageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message[] listMessageByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listMessageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listMessageByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message[] listMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return listMessageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listMessageByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message[] listMessageByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Message as Message");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Message[]) list.toArray(new Message[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMessageByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message[] listMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Message as Message");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Message[]) list.toArray(new Message[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listMessageByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message loadMessageByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMessageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadMessageByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message loadMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return loadMessageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadMessageByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message loadMessageByQuery(PersistentSession session, String condition, String orderBy) {
		Message[] messages = listMessageByQuery(session, condition, orderBy);
		if (messages != null && messages.length > 0)
			return messages[0];
		else
			return null;
	}
	
	public Message loadMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		Message[] messages = listMessageByQuery(session, condition, orderBy, lockMode);
		if (messages != null && messages.length > 0)
			return messages[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMessageByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateMessageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateMessageByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ma.massarpro.beans.MassarProPersistentManager.instance().getSession();
			return iterateMessageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateMessageByQuery(String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateMessageByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Message as Message");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateMessageByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public static java.util.Iterator iterateMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ma.massarpro.beans.Message as Message");
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
			_logger.error("iterateMessageByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new RuntimeException(e);
		}
	}
	
	public Message createMessage() {
		return new ma.massarpro.beans.Message();
	}
	
	public boolean save(ma.massarpro.beans.Message message) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().saveObject(message);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(massarPro.Message message)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean delete(ma.massarpro.beans.Message message) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().deleteObject(message);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(massarPro.Message message)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Message message) {
		try {
			if(message.getPersonne() != null) {
				message.getPersonne().messages_envoyés.remove(message);
			}
			
			ma.massarpro.beans.Personne[] lPersonness = message.personnes.toArray();
			for(int i = 0; i < lPersonness.length; i++) {
				lPersonness[i].messages_recus.remove(message);
			}
			return delete(message);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean deleteAndDissociate(ma.massarpro.beans.Message message, org.orm.PersistentSession session) {
		try {
			if(message.getPersonne() != null) {
				message.getPersonne().messages_envoyés.remove(message);
			}
			
			ma.massarpro.beans.Personne[] lPersonness = message.personnes.toArray();
			for(int i = 0; i < lPersonness.length; i++) {
				lPersonness[i].messages_recus.remove(message);
			}
			try {
				session.delete(message);
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
	
	public boolean refresh(ma.massarpro.beans.Message message) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().refresh(message);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(massarPro.Message message)", e);
			throw new RuntimeException(e);
		}
	}
	
	public boolean evict(ma.massarpro.beans.Message message) {
		try {
			ma.massarpro.beans.MassarProPersistentManager.instance().getSession().evict(message);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(massarPro.Message message)", e);
			throw new RuntimeException(e);
		}
	}
	
}
