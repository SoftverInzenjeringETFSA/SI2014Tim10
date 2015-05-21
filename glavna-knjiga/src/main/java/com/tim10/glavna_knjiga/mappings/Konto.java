package com.tim10.glavna_knjiga.mappings;

// Generated May 21, 2015 12:08:38 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Konto generated by hbm2java
 */
@Entity
@Table(name = "Konto", catalog = "Tim10")
public class Konto implements java.io.Serializable {

	private int idKonto;
	private Integer brojKonta;
	private String tip;
	private String naziv;
	private String opis;
	private Integer klasa;
	private Integer grupa;
	private Boolean status;

	public Konto() {
	}

	public Konto(int idKonto) {
		this.idKonto = idKonto;
	}

	public Konto(int idKonto, Integer brojKonta, String tip, String naziv,
			String opis, Integer klasa, Integer grupa, Boolean status) {
		this.idKonto = idKonto;
		this.brojKonta = brojKonta;
		this.tip = tip;
		this.naziv = naziv;
		this.opis = opis;
		this.klasa = klasa;
		this.grupa = grupa;
		this.status = status;
	}

	@Id
	@Column(name = "IdKonto", unique = true, nullable = false)
	public int getIdKonto() {
		return this.idKonto;
	}

	public void setIdKonto(int idKonto) {
		this.idKonto = idKonto;
	}

	@Column(name = "BrojKonta")
	public Integer getBrojKonta() {
		return this.brojKonta;
	}

	public void setBrojKonta(Integer brojKonta) {
		this.brojKonta = brojKonta;
	}

	@Column(name = "Tip", length = 45)
	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Column(name = "Naziv", length = 45)
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Column(name = "Opis", length = 45)
	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	@Column(name = "Klasa")
	public Integer getKlasa() {
		return this.klasa;
	}

	public void setKlasa(Integer klasa) {
		this.klasa = klasa;
	}

	@Column(name = "Grupa")
	public Integer getGrupa() {
		return this.grupa;
	}

	public void setGrupa(Integer grupa) {
		this.grupa = grupa;
	}

	@Column(name = "Status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
