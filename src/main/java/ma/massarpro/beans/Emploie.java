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
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Emploie")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Emploie implements Serializable {
	public Emploie() {
	}
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A83801144FBF239E207CFB")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239E207CFB", strategy="native")	
	private int ID;
	
	@OneToOne(targetEntity=Classe.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClasseID") })	
	@Basic(fetch=FetchType.LAZY)	
	private Classe classe;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setClasse(Classe value) {
		if (this.classe != value) {
			Classe lclasse = this.classe;
			this.classe = value;
			if (value != null) {
				classe.setEmploie(this);
			}
			else {
				lclasse.setEmploie(null);
			}
		}
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
