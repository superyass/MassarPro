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
@Table(name="Niveau")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Niveau implements Serializable {
	public Niveau() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_NIVEAU_ADMINISTRATEUR) {
			return ORM_administrateur;
		}
		else if (key == ma.massarpro.dao.impl.ORMConstants.KEY_NIVEAU_CLASSE) {
			return ORM_classe;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A83801144FBF23A0707D01")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF23A0707D01", strategy="native")	
	private int ID;
	
	@Column(name="Nom", nullable=true, length=255)	
	private String nom;
	
	@Column(name="Code", nullable=true, length=255)	
	private String code;
	
	@Column(name="AnnSco", nullable=false, length=11)	
	private int annSco;
	
	@ManyToMany(targetEntity=ma.massarpro.beans.Administrateur.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Personne_Niveau3", joinColumns={ @JoinColumn(name="NiveauID") }, inverseJoinColumns={ @JoinColumn(name="PersonneID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_administrateur = new java.util.HashSet();
	
	@OneToMany(mappedBy="niveau", targetEntity=ma.massarpro.beans.Classe.class)	
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
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setAnnSco(int value) {
		this.annSco = value;
	}
	
	public int getAnnSco() {
		return annSco;
	}
	
	private void setORM_Administrateur(java.util.Set value) {
		this.ORM_administrateur = value;
	}
	
	private java.util.Set getORM_Administrateur() {
		return ORM_administrateur;
	}
	
	@Transient	
	public final ma.massarpro.beans.AdministrateurSetCollection administrateur = new ma.massarpro.beans.AdministrateurSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_NIVEAU_ADMINISTRATEUR, ma.massarpro.dao.impl.ORMConstants.KEY_ADMINISTRATEUR_NIVEAU, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Classe(java.util.Set value) {
		this.ORM_classe = value;
	}
	
	private java.util.Set getORM_Classe() {
		return ORM_classe;
	}
	
	@Transient	
	public final ma.massarpro.beans.ClasseSetCollection classe = new ma.massarpro.beans.ClasseSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_NIVEAU_CLASSE, ma.massarpro.dao.impl.ORMConstants.KEY_CLASSE_NIVEAU, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
