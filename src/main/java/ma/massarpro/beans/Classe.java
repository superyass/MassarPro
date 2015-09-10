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
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import ma.massarpro.dao.impl.ORMConstants;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Classe")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Classe implements Serializable {
	public Classe() {
	}
	
	private Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CLASSE_ETUDIANT) {
			return ORM_etudiant;
		}
		else if (key == ORMConstants.KEY_CLASSE_PROFESSEUR) {
			return ORM_professeur;
		}
		else if (key == ORMConstants.KEY_CLASSE_MATIERE) {
			return ORM_matiere;
		}
		else if (key == ORMConstants.KEY_CLASSE_SUPPORT) {
			return ORM_support;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CLASSE_NIVEAU) {
			this.niveau = (Niveau) owner;
		}
		
		else if (key == ORMConstants.KEY_CLASSE_EMPLOIE) {
			this.emploie = (Emploie) owner;
		}
	}
	
	@Transient
	public	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A83801144FBF239D207CF9")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239D207CF9", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Niveau.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="NiveauID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private Niveau niveau;
	
	@Column(name="Nom", nullable=true, length=255)	
	private String nom;
	
	@Column(name="Code", nullable=true, length=255)	
	private String code;
	
	@ManyToMany(mappedBy="ORM_classes", targetEntity=Etudiant.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_etudiant = new HashSet();
	
	@ManyToMany(targetEntity=Professeur.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Personne_Classe6", joinColumns={ @JoinColumn(name="ClasseID") }, inverseJoinColumns={ @JoinColumn(name="PersonneID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_professeur = new HashSet();
	
	@ManyToMany(targetEntity=Matiere.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Classe_Matiere2", joinColumns={ @JoinColumn(name="ClasseID") }, inverseJoinColumns={ @JoinColumn(name="MatiereID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_matiere = new HashSet();
	
	@OneToOne(mappedBy="classe", targetEntity=Emploie.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@Basic(fetch=FetchType.LAZY)	
	private Emploie emploie;
	
	@ManyToMany(targetEntity=Support.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Classe_Support2", joinColumns={ @JoinColumn(name="ClasseID") }, inverseJoinColumns={ @JoinColumn(name="SupportID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_support = new HashSet();
	
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
	
	private void setORM_Etudiant(Set value) {
		this.ORM_etudiant = value;
	}
	
	private Set getORM_Etudiant() {
		return ORM_etudiant;
	}
	
	@Transient	
	public final EtudiantSetCollection etudiant = new EtudiantSetCollection(this, _ormAdapter, ORMConstants.KEY_CLASSE_ETUDIANT, ORMConstants.KEY_ETUDIANT_CLASSES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Professeur(Set value) {
		this.ORM_professeur = value;
	}
	
	private Set getORM_Professeur() {
		return ORM_professeur;
	}
	
	@Transient	
	public final ProfesseurSetCollection professeur = new ProfesseurSetCollection(this, _ormAdapter, ORMConstants.KEY_CLASSE_PROFESSEUR, ORMConstants.KEY_PROFESSEUR_CLASSE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setNiveau(Niveau value) {
		if (niveau != null) {
			niveau.classe.remove(this);
		}
		if (value != null) {
			value.classe.add(this);
		}
	}
	
	public Niveau getNiveau() {
		return niveau;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Niveau(Niveau value) {
		this.niveau = value;
	}
	
	private Niveau getORM_Niveau() {
		return niveau;
	}
	
	private void setORM_Matiere(Set value) {
		this.ORM_matiere = value;
	}
	
	private Set getORM_Matiere() {
		return ORM_matiere;
	}
	
	@Transient	
	public final MatiereSetCollection matiere = new MatiereSetCollection(this, _ormAdapter, ORMConstants.KEY_CLASSE_MATIERE, ORMConstants.KEY_MATIERE_CLASSES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEmploie(Emploie value) {
		if (this.emploie != value) {
			Emploie lemploie = this.emploie;
			this.emploie = value;
			if (value != null) {
				emploie.setClasse(this);
			}
			else {
				lemploie.setClasse(null);
			}
		}
	}
	
	public Emploie getEmploie() {
		return emploie;
	}
	
	private void setORM_Support(Set value) {
		this.ORM_support = value;
	}
	
	private Set getORM_Support() {
		return ORM_support;
	}
	
	@Transient	
	public final SupportSetCollection support = new SupportSetCollection(this, _ormAdapter, ORMConstants.KEY_CLASSE_SUPPORT, ORMConstants.KEY_SUPPORT_CLASSE, ORMConstants.KEY_MUL_MANY_TO_MANY);

	@Override
	public String toString() {
		return "Classe [ID=" + ID + ", nom=" + nom + ", code=" + code + "]";
	}
	
//	public String toString() {
//		return String.valueOf(getID());
//	}
	
	
}
