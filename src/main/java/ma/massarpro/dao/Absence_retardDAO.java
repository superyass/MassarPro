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

public interface Absence_retardDAO {
	public Absence_retard loadAbsence_retardByORMID(int ID);
	public Absence_retard getAbsence_retardByORMID(int ID);
	public Absence_retard loadAbsence_retardByORMID(int ID, org.hibernate.LockMode lockMode);
	public Absence_retard getAbsence_retardByORMID(int ID, org.hibernate.LockMode lockMode);
	public Absence_retard loadAbsence_retardByORMID(PersistentSession session, int ID);
	public Absence_retard getAbsence_retardByORMID(PersistentSession session, int ID);
	public Absence_retard loadAbsence_retardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Absence_retard getAbsence_retardByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public List<Absence_retard> listAbsence_retardByQuery(String condition, String orderBy);
	public Absence_retard[] listAbsence_retardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public List<Absence_retard> listAbsence_retardByQuery(PersistentSession session, String condition, String orderBy);
	public Absence_retard[] listAbsence_retardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Absence_retard loadAbsence_retardByQuery(String condition, String orderBy);
	public Absence_retard loadAbsence_retardByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Absence_retard loadAbsence_retardByQuery(PersistentSession session, String condition, String orderBy);
	public Absence_retard loadAbsence_retardByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Absence_retard createAbsence_retard();
	public boolean save(ma.massarpro.beans.Absence_retard absence_retard);
	public boolean delete(ma.massarpro.beans.Absence_retard absence_retard);
	public boolean deleteAndDissociate(ma.massarpro.beans.Absence_retard absence_retard);
	public boolean deleteAndDissociate(ma.massarpro.beans.Absence_retard absence_retard, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Absence_retard absence_retard);
	public boolean evict(ma.massarpro.beans.Absence_retard absence_retard);
}
