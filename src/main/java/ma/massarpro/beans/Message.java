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
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Message")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Message implements Serializable {
	public Message() {
	}
	
	private Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_MESSAGE_PERSONNES) {
			return ORM_personnes;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_MESSAGE_PERSONNE) {
			this.personne = (ma.massarpro.beans.Personne) owner;
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
	
	@Column(name="ID", nullable=false)	
	@Id	
	@GeneratedValue(generator="VC0A83801144FBF239DE07CFA")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239DE07CFA", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Personne.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="PersonneID", referencedColumnName="ID") })	
	@Basic(fetch=FetchType.LAZY)	
	private ma.massarpro.beans.Personne personne;
	
	@Column(name="Objet", nullable=true, length=255)	
	private String objet;
	
	@Column(name="Message", nullable=true, length=255)	
	private String message;
	
	@org.hibernate.annotations.CollectionOfElements	
	@JoinTable(name="Entité", joinColumns={ @JoinColumn(name="MessageID") })	
	@org.hibernate.annotations.IndexColumn(name="MessageIndex")	
	@Column(name="Vue", nullable=false, length=1)	
	private boolean[] vue;
	
	@ManyToMany(mappedBy="ORM_messages_recus", targetEntity=ma.massarpro.beans.Personne.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private Set ORM_personnes = new HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setObjet(String value) {
		this.objet = value;
	}
	
	public String getObjet() {
		return objet;
	}
	
	public void setMessage(String value) {
		this.message = value;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setVue(boolean[] value) {
		this.vue = value;
	}
	
	public boolean[] getVue() {
		return vue;
	}
	
	public void setPersonne(ma.massarpro.beans.Personne value) {
		if (personne != null) {
			personne.messages_envoyés.remove(this);
		}
		if (value != null) {
			value.messages_envoyés.add(this);
		}
	}
	
	public ma.massarpro.beans.Personne getPersonne() {
		return personne;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Personne(ma.massarpro.beans.Personne value) {
		this.personne = value;
	}
	
	private ma.massarpro.beans.Personne getORM_Personne() {
		return personne;
	}
	
	private void setORM_Personnes(Set value) {
		this.ORM_personnes = value;
	}
	
	private Set getORM_Personnes() {
		return ORM_personnes;
	}
	
	@Transient	
	public final ma.massarpro.beans.PersonneSetCollection personnes = new ma.massarpro.beans.PersonneSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_MESSAGE_PERSONNES, ma.massarpro.dao.impl.ORMConstants.KEY_PERSONNE_MESSAGES_RECUS, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
