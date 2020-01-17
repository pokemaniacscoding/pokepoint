package com.pokepoint.domain;

import java.io.Serializable;
import java.util.Objects;

public class MoveName implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String englishName;
	private String japaneseName;
	private String portugueseName;

	public MoveName(Integer id, String englishName, String japaneseName, String portugueseName) {
		this.id = id;
		this.englishName = englishName;
		this.japaneseName = japaneseName;
		this.portugueseName = portugueseName;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MoveName moveName = (MoveName) o;
		return Objects.equals(id, moveName.id) &&
				Objects.equals(englishName, moveName.englishName) &&
				Objects.equals(japaneseName, moveName.japaneseName) &&
				Objects.equals(portugueseName, moveName.portugueseName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, englishName, japaneseName, portugueseName);
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
		builder.append("]");
		return builder.toString();
	}

}
