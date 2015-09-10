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

public interface ProfesseurDAO {
	public Professeur loadProfesseurByORMID(int ID);
	public Professeur getProfesseurByORMID(int ID);
	public Professeur loadProfesseurByORMID(int ID, org.hibernate.LockMode lockMode);
	public Professeur getProfesseurByORMID(int ID, org.hibernate.LockMode lockMode);
	public Professeur loadProfesseurByORMID(PersistentSession session, int ID);
	public Professeur getProfesseurByORMID(PersistentSession session, int ID);
	public Professeur loadProfesseurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Professeur getProfesseurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Professeur[] listProfesseurByQuery(String condition, String orderBy);
	public Professeur[] listProfesseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Professeur[] listProfesseurByQuery(PersistentSession session, String condition, String orderBy);
	public Professeur[] listProfesseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Professeur loadProfesseurByQuery(String condition, String orderBy);
	public Professeur loadProfesseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Professeur loadProfesseurByQuery(PersistentSession session, String condition, String orderBy);
	public Professeur loadProfesseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Professeur createProfesseur();
	public boolean save(ma.massarpro.beans.Professeur professeur);
	public boolean delete(ma.massarpro.beans.Professeur professeur);
	public boolean deleteAndDissociate(ma.massarpro.beans.Professeur professeur);
	public boolean deleteAndDissociate(ma.massarpro.beans.Professeur professeur, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Professeur professeur);
	public boolean evict(ma.massarpro.beans.Professeur professeur);
}
