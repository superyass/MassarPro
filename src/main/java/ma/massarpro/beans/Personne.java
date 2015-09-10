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
@Table(name="Personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Personne")
public class Personne implements Serializable {
	public Personne() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ma.massarpro.dao.impl.ORMConstants.KEY_PERSONNE_MESSAGES_RECUS) {
			return ORM_messages_recus;
		}
		else if (key == ma.massarpro.dao.impl.ORMConstants.KEY_PERSONNE_MESSAGES_ENVOYÉS) {
			return ORM_messages_envoyés;
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
	@GeneratedValue(generator="VC0A83801144FBF239C107CF8")	
	@org.hibernate.annotations.GenericGenerator(name="VC0A83801144FBF239C107CF8", strategy="native")	
	private int ID;
	
	@Column(name="Nom", nullable=true, length=255)
	protected String nom;
	
	@Column(name="Prenom", nullable=true, length=255)
	protected String prenom;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Login", nullable=true, length=255)	
	private String login;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Info", nullable=true, length=255)	
	private String info;
	
	@Column(name="Telephone", nullable=true, length=255)	
	private String telephone;
	
	@ManyToMany(targetEntity=ma.massarpro.beans.Message.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Message_Personne2", joinColumns={ @JoinColumn(name="PersonneID") }, inverseJoinColumns={ @JoinColumn(name="MessageID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_messages_recus = new java.util.HashSet();
	
	@OneToMany(mappedBy="personne", targetEntity=ma.massarpro.beans.Message.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set ORM_messages_envoyés = new java.util.HashSet();
	
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
	
	public void setPrenom(String value) {
		this.prenom = value;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setLogin(String value) {
		this.login = value;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setInfo(String value) {
		this.info = value;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setTelephone(String value) {
		this.telephone = value;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	private void setORM_Messages_recus(java.util.Set value) {
		this.ORM_messages_recus = value;
	}
	
	private java.util.Set getORM_Messages_recus() {
		return ORM_messages_recus;
	}
	
	@Transient	
	public final ma.massarpro.beans.MessageSetCollection messages_recus = new ma.massarpro.beans.MessageSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_PERSONNE_MESSAGES_RECUS, ma.massarpro.dao.impl.ORMConstants.KEY_MESSAGE_PERSONNES, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Messages_envoyés(java.util.Set value) {
		this.ORM_messages_envoyés = value;
	}
	
	private java.util.Set getORM_Messages_envoyés() {
		return ORM_messages_envoyés;
	}
	
	@Transient	
	public final ma.massarpro.beans.MessageSetCollection messages_envoyés = new ma.massarpro.beans.MessageSetCollection(this, _ormAdapter, ma.massarpro.dao.impl.ORMConstants.KEY_PERSONNE_MESSAGES_ENVOYÉS, ma.massarpro.dao.impl.ORMConstants.KEY_MESSAGE_PERSONNE, ma.massarpro.dao.impl.ORMConstants.KEY_MUL_ONE_TO_MANY);

	@Override
	public String toString() {
		return "Personne [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom
				+ ", email=" + email + ", login=" + login + ", password="
				+ password + ", info=" + info + ", telephone=" + telephone
				+ "]";
	}
	
//	public String toString() {
//		return String.valueOf(getID());
//	}
	
	public void init() {
		ID=0;
		nom="vide";
		prenom="vide";
		email="vide";
		login="vide";
		password="vide";
		info="vide";
		telephone="vide";
	}
	
}
