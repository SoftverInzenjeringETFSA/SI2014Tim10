package com.tim10.glavna_knjiga.mappings;

// Generated May 21, 2015 7:20:17 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Nalozi generated by hbm2java
 */
@Entity
@Table(name = "Nalozi", catalog = "Tim10")
public class Nalozi implements java.io.Serializable {

	private int id;
	private Date datumKnjizenja;
	private Boolean status;
	private String nalozicol;

	public Nalozi() {
	}

	public Nalozi(int id) {
		this.id = id;
	}

	public Nalozi(int id, Date datumKnjizenja, Boolean status, String nalozicol) {
		this.id = id;
		this.datumKnjizenja = datumKnjizenja;
		this.status = status;
		this.nalozicol = nalozicol;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DatumKnjizenja", length = 0)
	public Date getDatumKnjizenja() {
		return this.datumKnjizenja;
	}

	public void setDatumKnjizenja(Date datumKnjizenja) {
		this.datumKnjizenja = datumKnjizenja;
	}

	@Column(name = "Status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "Nalozicol", length = 45)
	public String getNalozicol() {
		return this.nalozicol;
	}

	public void setNalozicol(String nalozicol) {
		this.nalozicol = nalozicol;
	}

}