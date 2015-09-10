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

import ma.massarpro.dao.*;
import ma.massarpro.dao.impl.DAOFactoryImpl;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract PersonneDAO getPersonneDAO();
	public abstract EtudiantDAO getEtudiantDAO();
	public abstract ParentDAO getParentDAO();
	public abstract ClasseDAO getClasseDAO();
	public abstract ProfesseurDAO getProfesseurDAO();
	public abstract MessageDAO getMessageDAO();
	public abstract EmploieDAO getEmploieDAO();
	public abstract ControleDAO getControleDAO();
	public abstract MatiereDAO getMatiereDAO();
	public abstract NotesDAO getNotesDAO();
	public abstract Absence_retardDAO getAbsence_retardDAO();
	public abstract SupportDAO getSupportDAO();
	public abstract NiveauDAO getNiveauDAO();
	public abstract AdministrateurDAO getAdministrateurDAO();
}

