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

public interface MatiereDAO {
	public Matiere loadMatiereByORMID(int ID);
	public Matiere getMatiereByORMID(int ID);
	public Matiere loadMatiereByORMID(int ID, org.hibernate.LockMode lockMode);
	public Matiere getMatiereByORMID(int ID, org.hibernate.LockMode lockMode);
	public Matiere loadMatiereByORMID(PersistentSession session, int ID);
	public Matiere getMatiereByORMID(PersistentSession session, int ID);
	public Matiere loadMatiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Matiere getMatiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Matiere[] listMatiereByQuery(String condition, String orderBy);
	public Matiere[] listMatiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Matiere[] listMatiereByQuery(PersistentSession session, String condition, String orderBy);
	public Matiere[] listMatiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Matiere loadMatiereByQuery(String condition, String orderBy);
	public Matiere loadMatiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Matiere loadMatiereByQuery(PersistentSession session, String condition, String orderBy);
	public Matiere loadMatiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Matiere createMatiere();
	public boolean save(ma.massarpro.beans.Matiere matiere);
	public boolean delete(ma.massarpro.beans.Matiere matiere);
	public boolean deleteAndDissociate(ma.massarpro.beans.Matiere matiere);
	public boolean deleteAndDissociate(ma.massarpro.beans.Matiere matiere, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Matiere matiere);
	public boolean evict(ma.massarpro.beans.Matiere matiere);
}
