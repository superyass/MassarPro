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
package ma.massarpro.dao;

import org.orm.*;
import org.hibernate.Query;

import java.util.List;

import ma.massarpro.beans.*;

public interface MessageDAO {
	public Message loadMessageByORMID(int ID);
	public Message getMessageByORMID(int ID);
	public Message loadMessageByORMID(int ID, org.hibernate.LockMode lockMode);
	public Message getMessageByORMID(int ID, org.hibernate.LockMode lockMode);
	public Message loadMessageByORMID(PersistentSession session, int ID);
	public Message getMessageByORMID(PersistentSession session, int ID);
	public Message loadMessageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Message getMessageByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Message[] listMessageByQuery(String condition, String orderBy);
	public Message[] listMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Message[] listMessageByQuery(PersistentSession session, String condition, String orderBy);
	public Message[] listMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Message loadMessageByQuery(String condition, String orderBy);
	public Message loadMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Message loadMessageByQuery(PersistentSession session, String condition, String orderBy);
	public Message loadMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Message createMessage();
	public boolean save(ma.massarpro.beans.Message message);
	public boolean delete(ma.massarpro.beans.Message message);
	public boolean deleteAndDissociate(ma.massarpro.beans.Message message);
	public boolean deleteAndDissociate(ma.massarpro.beans.Message message, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Message message);
	public boolean evict(ma.massarpro.beans.Message message);
}
