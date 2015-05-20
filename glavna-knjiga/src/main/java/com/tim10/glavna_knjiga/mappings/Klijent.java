package com.tim10.glavna_knjiga.mappings;

// Generated May 20, 2015 4:46:25 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Klijent generated by hbm2java
 */
@Entity
@Table(name = "Klijent", catalog = "Tim10")
public class Klijent implements java.io.Serializable {

	private int id;
	private String naziv;
	private String opis;
	private String adresa;
	private String telefon;
	private String fax;
	private String tip;

	public Klijent() {
	}

	public Klijent(int id) {
		this.id = id;
	}

	public Klijent(int id, String naziv, String opis, String adresa,
			String telefon, String fax, String tip) {
		this.id = id;
		this.naziv = naziv;
		this.opis = opis;
		this.adresa = adresa;
		this.telefon = telefon;
		this.fax = fax;
		this.tip = tip;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Naziv", length = 45)
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Column(name = "Opis", length = 200)
	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	@Column(name = "Adresa", length = 45)
	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Column(name = "Telefon", length = 20)
	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Column(name = "Fax", length = 20)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "Tip", length = 45)
	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

}
