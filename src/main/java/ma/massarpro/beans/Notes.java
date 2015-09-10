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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Notes")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Notes implements Serializable {
	public Notes() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_NOTES_ETUDIANT) {
			this.etudiant = (ma.massarpro.beans.Etudiant) owner;
		}
		
		else if (key == ma.massarpro.dao.impl.ORMConstants.KEY_NOTES_CONTROLE) {
			this.controle = (ma.massarpro.beans.Controle) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A83801144FBF239F607CFE")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239F607CFE", strategy="native")	
	private int ID;
	
	@Column(name="Valeur", nullable=false)	
	private float valeur;
	
	@Column(name="Appr", nullable=true, length=255)	
	private String appr;
	
	@Column(name="VueEtud", nullable=false, length=1)	
	private boolean vueEtud;
	
	@Column(name="VuePar", nullable=false, length=1)	
	private boolean vuePar;
	
	@ManyToOne(targetEntity=Controle.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ControleID", referencedColumnName="ID") })	
	private ma.massarpro.beans.Controle controle;
	
	@ManyToOne(targetEntity=Etudiant.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PersonneID", referencedColumnName="ID") })	
	private ma.massarpro.beans.Etudiant etudiant;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setValeur(float value) {
		this.valeur = value;
	}
	
	public float getValeur() {
		return valeur;
	}
	
	public void setAppr(String value) {
		this.appr = value;
	}
	
	public String getAppr() {
		return appr;
	}
	
	public void setVueEtud(boolean value) {
		this.vueEtud = value;
	}
	
	public boolean getVueEtud() {
		return vueEtud;
	}
	
	public void setVuePar(boolean value) {
		this.vuePar = value;
	}
	
	public boolean getVuePar() {
		return vuePar;
	}
	
	public void setEtudiant(ma.massarpro.beans.Etudiant value) {
		if (etudiant != null) {
			etudiant.notes.remove(this);
		}
		if (value != null) {
			value.notes.add(this);
		}
	}
	
	public ma.massarpro.beans.Etudiant getEtudiant() {
		return etudiant;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Etudiant(ma.massarpro.beans.Etudiant value) {
		this.etudiant = value;
	}
	
	private ma.massarpro.beans.Etudiant getORM_Etudiant() {
		return etudiant;
	}
	
	public void setControle(ma.massarpro.beans.Controle value) {
		if (controle != null) {
			controle.notess.remove(this);
		}
		if (value != null) {
			value.notess.add(this);
		}
	}
	
	public ma.massarpro.beans.Controle getControle() {
		return controle;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Controle(ma.massarpro.beans.Controle value) {
		this.controle = value;
	}
	
	private ma.massarpro.beans.Controle getORM_Controle() {
		return controle;
	}
	
//	public String toString() {
//		return String.valueOf(getID());
//	}

	@Override
	public String toString() {
		return "Notes [ID=" + ID + ", valeur=" + valeur + ", appr=" + appr
				+ ", vueEtud=" + vueEtud + ", vuePar=" + vuePar + "]";
	}
	
	
	
}
