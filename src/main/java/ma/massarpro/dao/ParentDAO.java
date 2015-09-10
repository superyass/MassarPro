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

public interface ParentDAO {
	public Parent loadParentByORMID(int ID);
	public Parent getParentByORMID(int ID);
	public Parent loadParentByORMID(int ID, org.hibernate.LockMode lockMode);
	public Parent getParentByORMID(int ID, org.hibernate.LockMode lockMode);
	public Parent loadParentByORMID(PersistentSession session, int ID);
	public Parent getParentByORMID(PersistentSession session, int ID);
	public Parent loadParentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Parent getParentByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Parent[] listParentByQuery(String condition, String orderBy);
	public Parent[] listParentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Parent[] listParentByQuery(PersistentSession session, String condition, String orderBy);
	public Parent[] listParentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Parent loadParentByQuery(String condition, String orderBy);
	public Parent loadParentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Parent loadParentByQuery(PersistentSession session, String condition, String orderBy);
	public Parent loadParentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Parent createParent();
	public boolean save(ma.massarpro.beans.Parent parent);
	public boolean delete(ma.massarpro.beans.Parent parent);
	public boolean deleteAndDissociate(ma.massarpro.beans.Parent parent);
	public boolean deleteAndDissociate(ma.massarpro.beans.Parent parent, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Parent parent);
	public boolean evict(ma.massarpro.beans.Parent parent);
}
