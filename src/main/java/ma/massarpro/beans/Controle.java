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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import ma.massarpro.dao.impl.ORMConstants;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Controle")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Controle implements Serializable {
	public Controle() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CONTROLE_NOTESS) {
			return ORM_notess;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CONTROLE_MATIERE) {
			this.matiere = (Matiere) owner;
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
	@GeneratedValue(generator="VC0A83801144FBF239E707CFC")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239E707CFC", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Matiere.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="MatiereID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private Matiere matiere;
	
	@Column(name="Coeff", nullable=false)	
	private float coeff;
	
	@Column(name="Nom", nullable=true, length=255)	
	private String nom;
	
	@Column(name="`Date`", nullable=true)	
	private Date date;
	
	@Column(name="Info", nullable=true, length=255)	
	private String info;
	
	@OneToMany(mappedBy="controle", targetEntity=Notes.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_notess = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCoeff(float value) {
		this.coeff = value;
	}
	
	public float getCoeff() {
		return coeff;
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setDate(Date value) {
		this.date = value;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setInfo(String value) {
		this.info = value;
	}
	
	public String getInfo() {
		return info;
	}
	
	public Etudiant[] getEtudiants() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = notess.getIterator();lIter.hasNext();) {
			lValues.add(((Notes)lIter.next()).getEtudiant());
		}
		return (Etudiant[])lValues.toArray(new Etudiant[lValues.size()]);
	}
	
	public void removeEtudiant(Etudiant aEtudiant) {
		Notes[] lNotess = notess.toArray();
		for(int i = 0; i < lNotess.length; i++) {
			if(lNotess[i].getEtudiant().equals(aEtudiant)) {
				notess.remove(lNotess[i]);
			}
		}
	}
	
	public void addEtudiant(Notes aNotes, Etudiant aEtudiant) {
		aNotes.setEtudiant(aEtudiant);
		notess.add(aNotes);
	}
	
	public Notes getNotesByEtudiant(Etudiant aEtudiant) {
		Notes[] lNotess = notess.toArray();
		for(int i = 0; i < lNotess.length; i++) {
			if(lNotess[i].getEtudiant().equals(aEtudiant)) {
				return lNotess[i];
			}
		}
		return null;
	}
	
	private void setORM_Notess(java.util.Set value) {
		this.ORM_notess = value;
	}
	
	private java.util.Set getORM_Notess() {
		return ORM_notess;
	}
	
	@Transient	
	public final NotesSetCollection notess = new NotesSetCollection(this, _ormAdapter, ORMConstants.KEY_CONTROLE_NOTESS, ORMConstants.KEY_NOTES_CONTROLE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setMatiere(Matiere value) {
		if (matiere != null) {
			matiere.controle.remove(this);
		}
		if (value != null) {
			value.controle.add(this);
		}
	}
	
	public Matiere getMatiere() {
		return matiere;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Matiere(Matiere value) {
		this.matiere = value;
	}
	
	private Matiere getORM_Matiere() {
		return matiere;
	}

	@Override
	public String toString() {
		return "Controle [ID=" + ID + ", coeff=" + coeff + ", nom=" + nom
				+ ", date=" + date + ", info=" + info + "]";
	}
	
//	public String toString() {
//		return String.valueOf(getID());
//	}
	
	
	
	
	
}
