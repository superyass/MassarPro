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
import javax.persistence.Table;
import javax.persistence.Transient;

import ma.massarpro.dao.impl.ORMConstants;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Absence_retard")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Absence_retard implements Serializable {
	public Absence_retard() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ABSENCE_RETARD_MATIERE) {
			this.matiere = (Matiere) owner;
		}
	}
	
	@Transient
	public	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A83801144FBF239FB07CFF")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239FB07CFF", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Matiere.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="MatiereID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private Matiere matiere;
	
	@Column(name="NumSean", nullable=false, length=11)	
	private int numSean;
	
	@Column(name="`Date`", nullable=true)	
	private Date date;
	
	@Column(name="Justifie", nullable=false, length=1)	
	private boolean justifie;
	
	@Column(name="VueEtud", nullable=false, length=1)	
	private boolean vueEtud;
	
	@Column(name="VuePar", nullable=false, length=1)	
	private boolean vuePar;
	
	@Column(name="Motif", nullable=true, length=255)	
	private String motif;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	@Column(name="absence", nullable=false, length=1)	
	private boolean absence;
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNumSean(int value) {
		this.numSean = value;
	}
	
	public int getNumSean() {
		return numSean;
	}
	
	public void setDate(Date value) {
		this.date = value;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setJustifie(boolean value) {
		this.justifie = value;
	}
	
	public boolean getJustifie() {
		return justifie;
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
	
	public void setMotif(String value) {
		this.motif = value;
	}
	
	public String getMotif() {
		return motif;
	}
	
	public void setMatiere(Matiere value) {
		if (matiere != null) {
			matiere.absence_retard.remove(this);
		}
		if (value != null) {
			value.absence_retard.add(this);
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
		return "Absence_retard [ID=" + ID + ", numSean=" + numSean + ", date="
				+ date + ", justifie=" + justifie + ", vueEtud=" + vueEtud
				+ ", vuePar=" + vuePar + ", motif=" + motif + "]";
	}

	public boolean isAbsence() {
		return absence;
	}

	public void setAbsence(boolean absence) {
		this.absence = absence;
	}

	
//	public String toString() {
//		return String.valueOf(getID());
//	}
	
	
}
