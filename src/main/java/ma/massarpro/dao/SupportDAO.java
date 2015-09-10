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

public interface SupportDAO {
	public Support loadSupportByORMID(int ID);
	public Support getSupportByORMID(int ID);
	public Support loadSupportByORMID(int ID, org.hibernate.LockMode lockMode);
	public Support getSupportByORMID(int ID, org.hibernate.LockMode lockMode);
	public Support loadSupportByORMID(PersistentSession session, int ID);
	public Support getSupportByORMID(PersistentSession session, int ID);
	public Support loadSupportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Support getSupportByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Support[] listSupportByQuery(String condition, String orderBy);
	public Support[] listSupportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Support[] listSupportByQuery(PersistentSession session, String condition, String orderBy);
	public Support[] listSupportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Support loadSupportByQuery(String condition, String orderBy);
	public Support loadSupportByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Support loadSupportByQuery(PersistentSession session, String condition, String orderBy);
	public Support loadSupportByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Support createSupport();
	public boolean save(ma.massarpro.beans.Support support);
	public boolean delete(ma.massarpro.beans.Support support);
	public boolean deleteAndDissociate(ma.massarpro.beans.Support support);
	public boolean deleteAndDissociate(ma.massarpro.beans.Support support, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Support support);
	public boolean evict(ma.massarpro.beans.Support support);
}
