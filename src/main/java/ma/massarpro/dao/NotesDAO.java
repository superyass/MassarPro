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

public interface NotesDAO {
	public Notes loadNotesByORMID(int ID);
	public Notes getNotesByORMID(int ID);
	public Notes loadNotesByORMID(int ID, org.hibernate.LockMode lockMode);
	public Notes getNotesByORMID(int ID, org.hibernate.LockMode lockMode);
	public Notes loadNotesByORMID(PersistentSession session, int ID);
	public Notes getNotesByORMID(PersistentSession session, int ID);
	public Notes loadNotesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Notes getNotesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode);
	public Notes[] listNotesByQuery(String condition, String orderBy);
	public Notes[] listNotesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Notes[] listNotesByQuery(PersistentSession session, String condition, String orderBy);
	public Notes[] listNotesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Notes loadNotesByQuery(String condition, String orderBy);
	public Notes loadNotesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Notes loadNotesByQuery(PersistentSession session, String condition, String orderBy);
	public Notes loadNotesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode);
	public Notes createNotes();
	public boolean save(ma.massarpro.beans.Notes notes);
	public boolean delete(ma.massarpro.beans.Notes notes);
	public boolean deleteAndDissociate(ma.massarpro.beans.Notes notes);
	public boolean deleteAndDissociate(ma.massarpro.beans.Notes notes, org.orm.PersistentSession session);
	public boolean refresh(ma.massarpro.beans.Notes notes);
	public boolean evict(ma.massarpro.beans.Notes notes);
}
