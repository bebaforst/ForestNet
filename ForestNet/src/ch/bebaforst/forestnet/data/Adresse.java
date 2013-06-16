package ch.bebaforst.forestnet.data;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import com.google.appengine.api.datastore.Key;

/**
 * Entity implementation class for Entity: Adresse
 *
 */
@Entity

public class Adresse implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Key ID;
	private String anrede;
	private String vorname;
	private String name;
	private String zusatz;
	private String strasse;
	private int plz;
	private String ort;
	private String mail;
	private String tel;
	private String mobil;
	private int status;
	private static final long serialVersionUID = 1L;

	public Adresse() {
		super();
	}   
	public String getAnrede() {
		return this.anrede;
	}

	public void setAnrede(String Anrede) {
		this.anrede = Anrede;
	}   
	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getZusatz() {
		return this.zusatz;
	}

	public void setZusatz(String zusatz) {
		this.zusatz = zusatz;
	}   
	public String getStrasse() {
		return this.strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}   
	public int getPlz() {
		return this.plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}   
	public String getOrt() {
		return this.ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}   
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}   
	public String getMobil() {
		return this.mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}   
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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
