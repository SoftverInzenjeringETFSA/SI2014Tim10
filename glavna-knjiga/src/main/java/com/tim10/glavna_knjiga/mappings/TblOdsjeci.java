package com.tim10.glavna_knjiga.mappings;

// Generated May 20, 2015 4:46:25 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TblOdsjeci generated by hbm2java
 */
@Entity
@Table(name = "tblOdsjeci", catalog = "Tim10")
public class TblOdsjeci implements java.io.Serializable {

	private Integer id;
	private String naziv;
	private Set<TblStudenti> tblStudentis = new HashSet<TblStudenti>(0);

	public TblOdsjeci() {
	}

	public TblOdsjeci(String naziv, Set<TblStudenti> tblStudentis) {
		this.naziv = naziv;
		this.tblStudentis = tblStudentis;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "naziv", length = 45)
	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblOdsjeci")
	public Set<TblStudenti> getTblStudentis() {
		return this.tblStudentis;
	}

	public void setTblStudentis(Set<TblStudenti> tblStudentis) {
		this.tblStudentis = tblStudentis;
	}

}
