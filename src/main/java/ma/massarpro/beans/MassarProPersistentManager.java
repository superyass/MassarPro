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
package ma.massarpro.beans;

import org.orm.*;
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;

public class MassarProPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "MassarPro";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	
	private MassarProPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties);
		setFlushMode(FlushMode.ALWAYS);
	}
	
	@Override
	public Configuration createConfiguration() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.addAnnotatedClass(ma.massarpro.beans.Personne.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Etudiant.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Parent.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Classe.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Professeur.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Message.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Emploie.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Controle.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Matiere.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Notes.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Absence_retard.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Support.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Niveau.class);
		configuration.addAnnotatedClass(ma.massarpro.beans.Administrateur.class);
		configuration.buildMappings();
		return configuration;
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new MassarProPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
