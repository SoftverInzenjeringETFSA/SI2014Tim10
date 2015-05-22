package com.tim10.glavna_knjiga.mappings;

// Generated May 22, 2015 3:37:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * KorisnikTipovi generated by hbm2java
 */
@Entity
@Table(name = "KorisnikTipovi", catalog = "Tim10")
public class KorisnikTipovi implements java.io.Serializable {

	private int id;
	private String naziv;
	private Set<Korisnik> korisniks = new HashSet<Korisnik>(0);

	public KorisnikTipovi() {
	}

	public KorisnikTipovi(int id) {
		this.id = id;
	}

	public KorisnikTipovi(int id, String naziv, Set<Korisnik> korisniks) {
		this.id = id;
		this.naziv = naziv;
		this.korisniks = korisniks;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Naziv", length = 20)
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "korisnikTipovi")
	public Set<Korisnik> getKorisniks() {
		return this.korisniks;
	}

	public void setKorisniks(Set<Korisnik> korisniks) {
		this.korisniks = korisniks;
	}

}
