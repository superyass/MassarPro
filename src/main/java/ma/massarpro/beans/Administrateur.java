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

import java.io.Serializable;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Administrateur")
public class Administrateur extends ma.massarpro.beans.Personne implements Serializable {
	public Administrateur() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_ADMINISTRATEUR_NIVEAU) {
			return ORM_niveau;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID2", nullable=true, length=11)	
	private int ID;
	
	@Column(name="SuperAdmin", nullable=true, length=1)	
	private boolean superAdmin;
	
	@ManyToMany(mappedBy="ORM_administrateur", targetEntity=ma.massarpro.beans.Niveau.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_niveau = new java.util.HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setSuperAdmin(boolean value) {
		this.superAdmin = value;
	}
	
	public boolean getSuperAdmin() {
		return superAdmin;
	}
	
	private void setORM_Niveau(java.util.Set value) {
		this.ORM_niveau = value;
	}
	
	private java.util.Set getORM_Niveau() {
		return ORM_niveau;
	}
	
	@Transient	
	public final ma.massarpro.beans.NiveauSetCollection niveau = new ma.massarpro.beans.NiveauSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_ADMINISTRATEUR_NIVEAU, ma.massarpro.dao.impl.ORMConstants.KEY_NIVEAU_ADMINISTRATEUR, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
