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

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Support")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Support implements Serializable {
	public Support() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_SUPPORT_CLASSE) {
			return ORM_classe;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_SUPPORT_PROFESSEUR) {
			this.professeur = (ma.massarpro.beans.Professeur) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A83801144FBF23A0107D00")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF23A0107D00", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Professeur.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PersonneID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private ma.massarpro.beans.Professeur professeur;
	
	@Column(name="Nom", nullable=true, length=255)	
	private String nom;
	
	@Column(name="Info", nullable=true, length=255)	
	private String info;
	
	@Column(name="`Date`", nullable=true)	
	private Date date;
	
	@Column(name="`Path`", nullable=false)
	private String path;

	@ManyToMany(mappedBy="ORM_support", targetEntity=ma.massarpro.beans.Classe.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_classe = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setInfo(String value) {
		this.info = value;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setDate(Date value) {
		this.date = value;
	}
	
	public Date getDate() {
		return date;
	}
	
	private void setORM_Classe(java.util.Set value) {
		this.ORM_classe = value;
	}
	
	private java.util.Set getORM_Classe() {
		return ORM_classe;
	}
	
	@Transient	
	public final ma.massarpro.beans.ClasseSetCollection classe = new ma.massarpro.beans.ClasseSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_SUPPORT_CLASSE, ma.massarpro.dao.impl.ORMConstants.KEY_CLASSE_SUPPORT, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setProfesseur(ma.massarpro.beans.Professeur value) {
		if (professeur != null) {
			professeur.support.remove(this);
		}
		if (value != null) {
			value.support.add(this);
		}
	}
	
	public ma.massarpro.beans.Professeur getProfesseur() {
		return professeur;
	}
	
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Professeur(ma.massarpro.beans.Professeur value) {
		this.professeur = value;
	}
	
	private ma.massarpro.beans.Professeur getORM_Professeur() {
		return professeur;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
