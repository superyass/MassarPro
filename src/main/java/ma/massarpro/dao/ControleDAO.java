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

public interface ControleDAO {
	public Controle loadControleByORMID(int ID);
	public Controle getControleByORMID(int ID);
	public Controle loadControleByORMID(int ID, org.hibernate.LockMode lockMode);
	public Controle getControleByORMID(int ID, org.hibernate.LockMode lockMode);
	public Controle loadControleByORMID(PersistentSession session, int ID);
	public Controle getControleByORMID(PersistentSession session, int ID);
	public Controle loadControleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Controle getControleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Controle[] listControleByQuery(String condition, String orderBy);
	public Controle[] listControleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Controle[] listControleByQuery(PersistentSession session, String condition, String orderBy);
	public Controle[] listControleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Controle loadControleByQuery(String condition, String orderBy);
	public Controle loadControleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Controle loadControleByQuery(PersistentSession session, String condition, String orderBy);
	public Controle loadControleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Controle createControle();
	public boolean save(ma.massarpro.beans.Controle controle);
	public boolean delete(ma.massarpro.beans.Controle controle);
	public boolean deleteAndDissociate(ma.massarpro.beans.Controle controle);
	public boolean deleteAndDissociate(ma.massarpro.beans.Controle controle, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Controle controle);
	public boolean evict(ma.massarpro.beans.Controle controle);
}
