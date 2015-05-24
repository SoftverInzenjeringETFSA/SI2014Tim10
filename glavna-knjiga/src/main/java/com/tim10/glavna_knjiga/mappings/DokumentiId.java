package com.tim10.glavna_knjiga.mappings;

// Generated May 24, 2015 3:19:06 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DokumentiId generated by hbm2java
 */
@Embeddable
public class DokumentiId implements java.io.Serializable {

	private int id;
	private int vrstaDokumentaId;

	public DokumentiId() {
	}

	public DokumentiId(int id, int vrstaDokumentaId) {
		this.id = id;
		this.vrstaDokumentaId = vrstaDokumentaId;
	}

	@Column(name = "Id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "VrstaDokumenta_Id", nullable = false)
	public int getVrstaDokumentaId() {
		return this.vrstaDokumentaId;
	}

	public void setVrstaDokumentaId(int vrstaDokumentaId) {
		this.vrstaDokumentaId = vrstaDokumentaId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DokumentiId))
			return false;
		DokumentiId castOther = (DokumentiId) other;

		return (this.getId() == castOther.getId())
				&& (this.getVrstaDokumentaId() == castOther
						.getVrstaDokumentaId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getVrstaDokumentaId();
		return result;
	}

}
