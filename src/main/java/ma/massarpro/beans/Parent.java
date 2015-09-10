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
@DiscriminatorValue("Parent")
public class Parent extends ma.massarpro.beans.Personne implements Serializable {
	public Parent() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_PARENT_ETUDIANT) {
			return ORM_etudiant;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="`Column`", nullable=true, length=11)	
	private int ID;
	
	@Column(name="MereNom", nullable=true, length=255)	
	private String mereNom;
	
	@Column(name="MerePrenom", nullable=true, length=255)	
	private String merePrenom;
	
	@Column(name="TelMere", nullable=true, length=255)	
	private String telMere;
	
	@Column(name="TelAdd", nullable=true, length=255)	
	private String telAdd;
	
	@Column(name="EmailMere", nullable=true, length=255)	
	private String emailMere;
	
	@OneToMany(mappedBy="parent", targetEntity=ma.massarpro.beans.Etudiant.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_etudiant = new java.util.HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setMereNom(String value) {
		this.mereNom = value;
	}
	
	public String getMereNom() {
		return mereNom;
	}
	
	public void setMerePrenom(String value) {
		this.merePrenom = value;
	}
	
	public String getMerePrenom() {
		return merePrenom;
	}
	
	public void setTelMere(String value) {
		this.telMere = value;
	}
	
	public String getTelMere() {
		return telMere;
	}
	
	public void setTelAdd(String value) {
		this.telAdd = value;
	}
	
	public String getTelAdd() {
		return telAdd;
	}
	
	public void setEmailMere(String value) {
		this.emailMere = value;
	}
	
	public String getEmailMere() {
		return emailMere;
	}
	
	private void setORM_Etudiant(java.util.Set value) {
		this.ORM_etudiant = value;
	}
	
	private java.util.Set getORM_Etudiant() {
		return ORM_etudiant;
	}
	
	@Transient	
	public final ma.massarpro.beans.EtudiantSetCollection etudiant = new ma.massarpro.beans.EtudiantSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_PARENT_ETUDIANT, ma.massarpro.dao.impl.ORMConstants.KEY_ETUDIANT_PARENT, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
