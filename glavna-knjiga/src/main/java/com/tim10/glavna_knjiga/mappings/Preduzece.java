package com.tim10.glavna_knjiga.mappings;

// Generated May 21, 2015 7:20:17 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Preduzece generated by hbm2java
 */
@Entity
@Table(name = "Preduzece", catalog = "Tim10")
public class Preduzece implements java.io.Serializable {

	private int idPreduzece;
	private String naziv;
	private String opis;
	private String adresa;
	private String telefon;
	private String fax;
	private Set<KontniPlan> kontniPlans = new HashSet<KontniPlan>(0);

	public Preduzece() {
	}

	public Preduzece(int idPreduzece) {
		this.idPreduzece = idPreduzece;
	}

	public Preduzece(int idPreduzece, String naziv, String opis, String adresa,
			String telefon, String fax, Set<KontniPlan> kontniPlans) {
		this.idPreduzece = idPreduzece;
		this.naziv = naziv;
		this.opis = opis;
		this.adresa = adresa;
		this.telefon = telefon;
		this.fax = fax;
		this.kontniPlans = kontniPlans;
	}

	@Id
	@Column(name = "IdPreduzece", unique = true, nullable = false)
	public int getIdPreduzece() {
		return this.idPreduzece;
	}

	public void setIdPreduzece(int idPreduzece) {
		this.idPreduzece = idPreduzece;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "preduzece")
	public Set<KontniPlan> getKontniPlans() {
		return this.kontniPlans;
	}

	public void setKontniPlans(Set<KontniPlan> kontniPlans) {
		this.kontniPlans = kontniPlans;
	}

}
