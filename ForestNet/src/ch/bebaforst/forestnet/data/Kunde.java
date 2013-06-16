package ch.bebaforst.forestnet.data;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


import com.google.appengine.api.datastore.Key;

/**
 * Entity implementation class for Entity: Kunde
 *
 */
@Entity

public class Kunde implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Key ID;
	private String Vorname;
	private String Name;
	private static final long serialVersionUID = 1L;

	public Kunde() {
		super();
	}   
	public Key getID() {
		return this.ID;
	}

	public void setID(Key ID) {
		this.ID = ID;
	}   
	public String getVorname() {
		return this.Vorname;
	}

	public void setVorname(String Vorname) {
		this.Vorname = Vorname;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	public void save(){
		EntityManager em = EMF.get().createEntityManager();
		try {
		em.persist(this);	
		} finally {
			em.close();
		}
	}
   
}
