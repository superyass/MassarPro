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
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Professeur")
public class Professeur extends ma.massarpro.beans.Personne implements Serializable {
	public Professeur() {
	}
	
	private Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_PROFESSEUR_CLASSE) {
			return ORM_classe;
		}
		else if (key == ma.massarpro.dao.impl.ORMConstants.KEY_PROFESSEUR_SUPPORT) {
			return ORM_support;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Column3", nullable=true, length=11)	
	private int ID;
	
	@Column(name="Vacataire", nullable=true, length=1)	
	private boolean vacataire;
	
	@Column(name="DateEmb", nullable=true)	
	private Date dateEmb;
	
	@ManyToMany(mappedBy="ORM_professeur", targetEntity=ma.massarpro.beans.Classe.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_classe = new HashSet();
	
	@OneToMany(mappedBy="professeur", targetEntity=ma.massarpro.beans.Support.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_support = new HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setVacataire(boolean value) {
		this.vacataire = value;
	}
	
	public boolean getVacataire() {
		return vacataire;
	}
	
	public void setDateEmb(Date value) {
		this.dateEmb = value;
	}
	
	public Date getDateEmb() {
		return dateEmb;
	}
	
	private void setORM_Classe(Set value) {
		this.ORM_classe = value;
	}
	
	private Set getORM_Classe() {
		return ORM_classe;
	}
	
	@Transient	
	public final ma.massarpro.beans.ClasseSetCollection classe = new ma.massarpro.beans.ClasseSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_PROFESSEUR_CLASSE, ma.massarpro.dao.impl.ORMConstants.KEY_CLASSE_PROFESSEUR, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Support(Set value) {
		this.ORM_support = value;
	}
	
	private Set getORM_Support() {
		return ORM_support;
	}
	
	@Transient	
	public final ma.massarpro.beans.SupportSetCollection support = new ma.massarpro.beans.SupportSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_PROFESSEUR_SUPPORT, ma.massarpro.dao.impl.ORMConstants.KEY_SUPPORT_PROFESSEUR, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
