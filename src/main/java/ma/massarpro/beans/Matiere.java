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
@Table(name="Matiere")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Matiere implements Serializable {
	public Matiere() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_MATIERE_CLASSES) {
			return ORM_classes;
		}
		else if (key == ma.massarpro.dao.impl.ORMConstants.KEY_MATIERE_ABSENCE_RETARD) {
			return ORM_absence_retard;
		}
		else if (key == ma.massarpro.dao.impl.ORMConstants.KEY_MATIERE_CONTROLE) {
			return ORM_controle;
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
	@GeneratedValue(generator="VC0A83801144FBF239F007CFD")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239F007CFD", strategy="native")	
	private int ID;
	
	@Column(name="Nom", nullable=true, length=255)	
	private String nom;
	
	@Column(name="Code", nullable=true, length=255)	
	private String code;
	
	@ManyToMany(mappedBy="ORM_matiere", targetEntity=ma.massarpro.beans.Classe.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_classes = new java.util.HashSet();
	
	@OneToMany(mappedBy="matiere", targetEntity=ma.massarpro.beans.Absence_retard.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_absence_retard = new java.util.HashSet();
	
	@OneToMany(mappedBy="matiere", targetEntity=ma.massarpro.beans.Controle.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_controle = new java.util.HashSet();
	
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
	
	private void setORM_Classes(java.util.Set value) {
		this.ORM_classes = value;
	}
	
	private java.util.Set getORM_Classes() {
		return ORM_classes;
	}
	
	@Transient	
	public final ma.massarpro.beans.ClasseSetCollection classes = new ma.massarpro.beans.ClasseSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_MATIERE_CLASSES, ma.massarpro.dao.impl.ORMConstants.KEY_CLASSE_MATIERE, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Absence_retard(java.util.Set value) {
		this.ORM_absence_retard = value;
	}
	
	private java.util.Set getORM_Absence_retard() {
		return ORM_absence_retard;
	}
	
	@Transient	
	public final ma.massarpro.beans.Absence_retardSetCollection absence_retard = new ma.massarpro.beans.Absence_retardSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_MATIERE_ABSENCE_RETARD, ma.massarpro.dao.impl.ORMConstants.KEY_ABSENCE_RETARD_MATIERE, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Controle(java.util.Set value) {
		this.ORM_controle = value;
	}
	
	private java.util.Set getORM_Controle() {
		return ORM_controle;
	}
	
	@Transient	
	public final ma.massarpro.beans.ControleSetCollection controle = new ma.massarpro.beans.ControleSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_MATIERE_CONTROLE, ma.massarpro.dao.impl.ORMConstants.KEY_CONTROLE_MATIERE, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_ONE_TO_MANY);

	@Override
	public String toString() {
		return "Matiere [ID=" + ID + ", nom=" + nom + ", code=" + code + "]";
	}

	
	
	
}
