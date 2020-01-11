package com.pokepoint.domain;

import java.io.Serializable;

public class MoveName implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String englishName;
	private String japaneseName;
	private String portugueseName;
	private String spanishName;
	
	public MoveName(Integer id, String englishName, String japaneseName, String portugueseName, String spanishName) {
		this.id = id;
		this.englishName = englishName;
		this.japaneseName = japaneseName;
		this.portugueseName = portugueseName;
		this.spanishName = spanishName;
	}

	public Integer getId() {
		return this.id;
	}
	
	public String getEnglishName() {
		return this.englishName;
	}

	public String getJapaneseName() {
		return this.japaneseName;
	}

	public String getPortugueseName() {
		return this.portugueseName;
	}

	public String getSpanishName() {
		return this.spanishName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public void setJapaneseName(String japaneseName) {
		this.japaneseName = japaneseName;
	}

	public void setPortugueseName(String portugueseName) {
		this.portugueseName = portugueseName;
	}

	public void setSpanishName(String spanishName) {
		this.spanishName = spanishName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((englishName == null) ? 0 : englishName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((japaneseName == null) ? 0 : japaneseName.hashCode());
		result = prime * result + ((portugueseName == null) ? 0 : portugueseName.hashCode());
		result = prime * result + ((spanishName == null) ? 0 : spanishName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoveName other = (MoveName) obj;
		if (englishName == null) {
			if (other.englishName != null)
				return false;
		} else if (!englishName.equals(other.englishName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (japaneseName == null) {
			if (other.japaneseName != null)
				return false;
		} else if (!japaneseName.equals(other.japaneseName))
			return false;
		if (portugueseName == null) {
			if (other.portugueseName != null)
				return false;
		} else if (!portugueseName.equals(other.portugueseName))
			return false;
		if (spanishName == null) {
			if (other.spanishName != null)
				return false;
		} else if (!spanishName.equals(other.spanishName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MoveName [id=");
		builder.append(id);
		builder.append(", englishName=");
		builder.append(englishName);
		builder.append(", japaneseName=");
		builder.append(japaneseName);
		builder.append(", portugueseName=");
		builder.append(portugueseName);
		builder.append(", spanishName=");
		builder.append(spanishName);
		builder.append("]");
		return builder.toString();
	}

}
