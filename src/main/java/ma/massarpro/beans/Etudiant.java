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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import ma.massarpro.dao.impl.ORMConstants;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Etudiant")
public class Etudiant extends Personne implements Serializable {
	public Etudiant() {
	}
	
	private Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ETUDIANT_CLASSES) {
			return ORM_classes;
		}
		else if (key == ORMConstants.KEY_ETUDIANT_NOTESS) {
			return ORM_notess;
		}
		else if (key == ORMConstants.KEY_ETUDIANT_ABSENCE_RETARD) {
			return ORM_absence_retard;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ETUDIANT_PARENT) {
			this.parent = (Parent) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=Parent.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PersonneID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private Parent parent;
	
	@Column(name="Column2", nullable=true, length=11)	
	private int ID;
	
	@Column(name="Code", nullable=true, length=255)	
	private String code;
	
	@Column(name="Date_naiss", nullable=true)	
	private Date date_naiss;
	
	@ManyToMany(targetEntity=Classe.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Personne_Classe5", joinColumns={ @JoinColumn(name="PersonneID") }, inverseJoinColumns={ @JoinColumn(name="ClasseID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_classes = new HashSet();
	
	@OneToMany(mappedBy="etudiant", targetEntity=Notes.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_notess = new HashSet();
	
	@OneToMany(targetEntity=Absence_retard.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumn(name="PersonneID", nullable=true)	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_absence_retard = new HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setDate_naiss(Date value) {
		this.date_naiss = value;
	}
	
	public Date getDate_naiss() {
		return date_naiss;
	}
	
	private void setORM_Classes(Set value) {
		this.ORM_classes = value;
	}
	
	private Set getORM_Classes() {
		return ORM_classes;
	}
	
	@Transient	
	public final ClasseSetCollection classes = new ClasseSetCollection(this, _ormAdapter, ORMConstants.KEY_ETUDIANT_CLASSES, ORMConstants.KEY_CLASSE_ETUDIANT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setParent(Parent value) {
		if (parent != null) {
			parent.etudiant.remove(this);
		}
		if (value != null) {
			value.etudiant.add(this);
		}
	}
	
	public Parent getParent() {
		return parent;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Parent(Parent value) {
		this.parent = value;
	}
	
	private Parent getORM_Parent() {
		return parent;
	}
	
	public Controle[] getControles() {
		ArrayList lValues = new ArrayList(5);
		for(Iterator lIter = notes.getIterator();lIter.hasNext();) {
			lValues.add(((Notes)lIter.next()).getControle());
		}
		return (Controle[])lValues.toArray(new Controle[lValues.size()]);
	}
	
	public void removeControle(Controle aControle) {
		Notes[] lNotess = notes.toArray();
		for(int i = 0; i < lNotess.length; i++) {
			if(lNotess[i].getControle().equals(aControle)) {
				notes.remove(lNotess[i]);
			}
		}
	}
	
	public void addControle(Notes aNotes, Controle aControle) {
		aNotes.setControle(aControle);
		notes.add(aNotes);
	}
	
	public Notes getNotesByControle(Controle aControle) {
		Notes[] lNotess = notes.toArray();
		for(int i = 0; i < lNotess.length; i++) {
			if(lNotess[i].getControle().equals(aControle)) {
				return lNotess[i];
			}
		}
		return null;
	}
	
	private void setORM_Notess(Set value) {
		this.ORM_notess = value;
	}
	
	private Set getORM_Notess() {
		return ORM_notess;
	}
	
	@Transient	
	public final NotesSetCollection notes = new NotesSetCollection(this, _ormAdapter, ORMConstants.KEY_ETUDIANT_NOTESS, ORMConstants.KEY_NOTES_ETUDIANT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Absence_retard(Set value) {
		this.ORM_absence_retard = value;
	}
	
	private Set getORM_Absence_retard() {
		return ORM_absence_retard;
	}
	
	@Transient	
	public final Absence_retardSetCollection absence_retard = new Absence_retardSetCollection(this, _ormAdapter, ORMConstants.KEY_ETUDIANT_ABSENCE_RETARD, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
	public void init() {
		nom="vide";
		prenom="vide";
	}
	
}
