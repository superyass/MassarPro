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

public interface AdministrateurDAO {
	public Administrateur loadAdministrateurByORMID(int ID);
	public Administrateur getAdministrateurByORMID(int ID);
	public Administrateur loadAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode);
	public Administrateur getAdministrateurByORMID(int ID, org.hibernate.LockMode lockMode);
	public Administrateur loadAdministrateurByORMID(PersistentSession session, int ID);
	public Administrateur getAdministrateurByORMID(PersistentSession session, int ID);
	public Administrateur loadAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Administrateur getAdministrateurByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Administrateur[] listAdministrateurByQuery(String condition, String orderBy);
	public Administrateur[] listAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Administrateur[] listAdministrateurByQuery(PersistentSession session, String condition, String orderBy);
	public Administrateur[] listAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Administrateur loadAdministrateurByQuery(String condition, String orderBy);
	public Administrateur loadAdministrateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Administrateur loadAdministrateurByQuery(PersistentSession session, String condition, String orderBy);
	public Administrateur loadAdministrateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Administrateur createAdministrateur();
	public boolean save(ma.massarpro.beans.Administrateur administrateur);
	public boolean delete(ma.massarpro.beans.Administrateur administrateur);
	public boolean deleteAndDissociate(ma.massarpro.beans.Administrateur administrateur);
	public boolean deleteAndDissociate(ma.massarpro.beans.Administrateur administrateur, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Administrateur administrateur);
	public boolean evict(ma.massarpro.beans.Administrateur administrateur);
}
