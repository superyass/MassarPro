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

public interface EtudiantDAO {
	public Etudiant loadEtudiantByORMID(int ID);
	public Etudiant getEtudiantByORMID(int ID);
	public Etudiant loadEtudiantByORMID(int ID, org.hibernate.LockMode lockMode);
	public Etudiant getEtudiantByORMID(int ID, org.hibernate.LockMode lockMode);
	public Etudiant loadEtudiantByORMID(PersistentSession session, int ID);
	public Etudiant getEtudiantByORMID(PersistentSession session, int ID);
	public Etudiant loadEtudiantByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Etudiant getEtudiantByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public List<Etudiant> listEtudiant();
	public Etudiant[] listEtudiantByQuery(String condition, String orderBy);
	public Etudiant[] listEtudiantByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Etudiant[] listEtudiantByQuery(PersistentSession session, String condition, String orderBy);
	public Etudiant[] listEtudiantByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Etudiant loadEtudiantByQuery(String condition, String orderBy);
	public Etudiant loadEtudiantByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Etudiant loadEtudiantByQuery(PersistentSession session, String condition, String orderBy);
	public Etudiant loadEtudiantByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Etudiant createEtudiant();
	public boolean save(ma.massarpro.beans.Etudiant etudiant);
	public boolean delete(ma.massarpro.beans.Etudiant etudiant);
	public boolean deleteAndDissociate(ma.massarpro.beans.Etudiant etudiant);
	public boolean deleteAndDissociate(ma.massarpro.beans.Etudiant etudiant, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Etudiant etudiant);
	public boolean evict(ma.massarpro.beans.Etudiant etudiant);
}
