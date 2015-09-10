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

public interface ClasseDAO {
	public Classe loadClasseByORMID(int ID);
	public Classe getClasseByORMID(int ID);
	public Classe loadClasseByORMID(int ID, org.hibernate.LockMode lockMode);
	public Classe getClasseByORMID(int ID, org.hibernate.LockMode lockMode);
	public Classe loadClasseByORMID(PersistentSession session, int ID);
	public Classe getClasseByORMID(PersistentSession session, int ID);
	public Classe loadClasseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Classe getClasseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Classe[] listClasseByQuery(String condition, String orderBy);
	public Classe[] listClasseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Classe[] listClasseByQuery(PersistentSession session, String condition, String orderBy);
	public Classe[] listClasseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Classe loadClasseByQuery(String condition, String orderBy);
	public Classe loadClasseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Classe loadClasseByQuery(PersistentSession session, String condition, String orderBy);
	public Classe loadClasseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Classe createClasse();
	public boolean save(ma.massarpro.beans.Classe classe);
	public boolean delete(ma.massarpro.beans.Classe classe);
	public boolean deleteAndDissociate(ma.massarpro.beans.Classe classe);
	public boolean deleteAndDissociate(ma.massarpro.beans.Classe classe, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Classe classe);
	public boolean evict(ma.massarpro.beans.Classe classe);
}
