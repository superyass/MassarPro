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

public interface PersonneDAO {
	public Personne loadPersonneByORMID(int ID);
	public Personne getPersonneByORMID(int ID);
	public Personne loadPersonneByORMID(int ID, org.hibernate.LockMode lockMode);
	public Personne getPersonneByORMID(int ID, org.hibernate.LockMode lockMode);
	public Personne loadPersonneByORMID(PersistentSession session, int ID);
	public Personne getPersonneByORMID(PersistentSession session, int ID);
	public Personne loadPersonneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Personne getPersonneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Personne[] listPersonneByQuery(String condition, String orderBy);
	public Personne[] listPersonneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Personne[] listPersonneByQuery(PersistentSession session, String condition, String orderBy);
	public Personne[] listPersonneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Personne loadPersonneByQuery(String condition, String orderBy);
	public Personne loadPersonneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Personne loadPersonneByQuery(PersistentSession session, String condition, String orderBy);
	public Personne loadPersonneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Personne createPersonne();
	public boolean save(ma.massarpro.beans.Personne personne);
	public boolean delete(ma.massarpro.beans.Personne personne);
	public boolean deleteAndDissociate(ma.massarpro.beans.Personne personne);
	public boolean deleteAndDissociate(ma.massarpro.beans.Personne personne, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Personne personne);
	public boolean evict(ma.massarpro.beans.Personne personne);
}
