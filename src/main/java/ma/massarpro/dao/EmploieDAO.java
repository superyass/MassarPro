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

public interface EmploieDAO {
	public Emploie loadEmploieByORMID(int ID);
	public Emploie getEmploieByORMID(int ID);
	public Emploie loadEmploieByORMID(int ID, org.hibernate.LockMode lockMode);
	public Emploie getEmploieByORMID(int ID, org.hibernate.LockMode lockMode);
	public Emploie loadEmploieByORMID(PersistentSession session, int ID);
	public Emploie getEmploieByORMID(PersistentSession session, int ID);
	public Emploie loadEmploieByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Emploie getEmploieByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Emploie[] listEmploieByQuery(String condition, String orderBy);
	public Emploie[] listEmploieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Emploie[] listEmploieByQuery(PersistentSession session, String condition, String orderBy);
	public Emploie[] listEmploieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Emploie loadEmploieByQuery(String condition, String orderBy);
	public Emploie loadEmploieByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Emploie loadEmploieByQuery(PersistentSession session, String condition, String orderBy);
	public Emploie loadEmploieByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Emploie createEmploie();
	public boolean save(ma.massarpro.beans.Emploie emploie);
	public boolean delete(ma.massarpro.beans.Emploie emploie);
	public boolean deleteAndDissociate(ma.massarpro.beans.Emploie emploie);
	public boolean deleteAndDissociate(ma.massarpro.beans.Emploie emploie, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Emploie emploie);
	public boolean evict(ma.massarpro.beans.Emploie emploie);
}
