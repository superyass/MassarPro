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

public interface NiveauDAO {
	public Niveau loadNiveauByORMID(int ID);
	public Niveau getNiveauByORMID(int ID);
	public Niveau loadNiveauByORMID(int ID, org.hibernate.LockMode lockMode);
	public Niveau getNiveauByORMID(int ID, org.hibernate.LockMode lockMode);
	public Niveau loadNiveauByORMID(PersistentSession session, int ID);
	public Niveau getNiveauByORMID(PersistentSession session, int ID);
	public Niveau loadNiveauByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Niveau getNiveauByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Niveau[] listNiveauByQuery(String condition, String orderBy);
	public Niveau[] listNiveauByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Niveau[] listNiveauByQuery(PersistentSession session, String condition, String orderBy);
	public Niveau[] listNiveauByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Niveau loadNiveauByQuery(String condition, String orderBy);
	public Niveau loadNiveauByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Niveau loadNiveauByQuery(PersistentSession session, String condition, String orderBy);
	public Niveau loadNiveauByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Niveau createNiveau();
	public boolean save(ma.massarpro.beans.Niveau niveau);
	public boolean delete(ma.massarpro.beans.Niveau niveau);
	public boolean deleteAndDissociate(ma.massarpro.beans.Niveau niveau);
	public boolean deleteAndDissociate(ma.massarpro.beans.Niveau niveau, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Niveau niveau);
	public boolean evict(ma.massarpro.beans.Niveau niveau);
}
