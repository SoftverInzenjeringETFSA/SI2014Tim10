package com.tim10.glavna_knjiga.mappings;

// Generated May 24, 2015 3:19:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * KontniOkvir generated by hbm2java
 */
@Entity
@Table(name = "KontniOkvir", catalog = "Tim10")
public class KontniOkvir implements java.io.Serializable {

	private Integer id;
	private String brojKonta;
	private String naziv;
	private Set<KontniPlan> kontniPlans = new HashSet<KontniPlan>(0);
	private Set<StavkeNaloga> stavkeNalogas = new HashSet<StavkeNaloga>(0);

	public KontniOkvir() {
	}

	public KontniOkvir(String brojKonta, String naziv) {
		this.brojKonta = brojKonta;
		this.naziv = naziv;
	}

	public KontniOkvir(String brojKonta, String naziv,
			Set<KontniPlan> kontniPlans, Set<StavkeNaloga> stavkeNalogas) {
		this.brojKonta = brojKonta;
		this.naziv = naziv;
		this.kontniPlans = kontniPlans;
		this.stavkeNalogas = stavkeNalogas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "BrojKonta", nullable = false, length = 16777215)
	public String getBrojKonta() {
		return this.brojKonta;
	}

	public void setBrojKonta(String brojKonta) {
		this.brojKonta = brojKonta;
	}

	@Column(name = "Naziv", nullable = false, length = 16777215)
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "KontniPlan_has_KontniOkvir", catalog = "Tim10", joinColumns = { @JoinColumn(name = "KontniOkvir_Id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "KontniPlan_IdKontniPlan", nullable = false, updatable = false) })
	public Set<KontniPlan> getKontniPlans() {
		return this.kontniPlans;
	}

	public void setKontniPlans(Set<KontniPlan> kontniPlans) {
		this.kontniPlans = kontniPlans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kontniOkvir")
	public Set<StavkeNaloga> getStavkeNalogas() {
		return this.stavkeNalogas;
	}

	public void setStavkeNalogas(Set<StavkeNaloga> stavkeNalogas) {
		this.stavkeNalogas = stavkeNalogas;
	}

}
