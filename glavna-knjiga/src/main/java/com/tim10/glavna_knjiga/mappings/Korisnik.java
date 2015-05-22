package com.tim10.glavna_knjiga.mappings;

// Generated May 22, 2015 3:37:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Korisnik generated by hbm2java
 */
@Entity
@Table(name = "Korisnik", catalog = "Tim10", uniqueConstraints = @UniqueConstraint(columnNames = "Ime"))
public class Korisnik implements java.io.Serializable {

	private int id;
	private KorisnikTipovi korisnikTipovi;
	private String ime;
	private String prezime;
	private String korisnickoIme;
	private String lozinka;
	private String adresa;
	private Integer jmbg;
	private Integer telefon;
	private Integer fax;
	private String email;
	private Set<Nalozi> nalozis = new HashSet<Nalozi>(0);

	public Korisnik() {
	}

	public Korisnik(int id, KorisnikTipovi korisnikTipovi) {
		this.id = id;
		this.korisnikTipovi = korisnikTipovi;
	}

	public Korisnik(int id, KorisnikTipovi korisnikTipovi, String ime,
			String prezime, String korisnickoIme, String lozinka,
			String adresa, Integer jmbg, Integer telefon, Integer fax,
			String email, Set<Nalozi> nalozis) {
		this.id = id;
		this.korisnikTipovi = korisnikTipovi;
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.adresa = adresa;
		this.jmbg = jmbg;
		this.telefon = telefon;
		this.fax = fax;
		this.email = email;
		this.nalozis = nalozis;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "KorisnikTipovi_Id", nullable = false)
	public KorisnikTipovi getKorisnikTipovi() {
		return this.korisnikTipovi;
	}

	public void setKorisnikTipovi(KorisnikTipovi korisnikTipovi) {
		this.korisnikTipovi = korisnikTipovi;
	}

	@Column(name = "Ime", unique = true, length = 20)
	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	@Column(name = "Prezime", length = 20)
	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Column(name = "KorisnickoIme", length = 12)
	public String getKorisnickoIme() {
		return this.korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	@Column(name = "Lozinka", length = 10)
	public String getLozinka() {
		return this.lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	@Column(name = "Adresa", length = 45)
	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Column(name = "JMBG")
	public Integer getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(Integer jmbg) {
		this.jmbg = jmbg;
	}

	@Column(name = "Telefon")
	public Integer getTelefon() {
		return this.telefon;
	}

	public void setTelefon(Integer telefon) {
		this.telefon = telefon;
	}

	@Column(name = "Fax")
	public Integer getFax() {
		return this.fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "korisnik")
	public Set<Nalozi> getNalozis() {
		return this.nalozis;
	}

	public void setNalozis(Set<Nalozi> nalozis) {
		this.nalozis = nalozis;
	}

}
