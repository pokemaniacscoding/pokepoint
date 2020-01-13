package com.pokepoint.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="type")
public class TypePokemon implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String englishName;
    private String japaneseName;
    private String portugueseName;
    private String spanishName;

    public TypePokemon() {
    }

    public TypePokemon(Integer id, String englishName, String japaneseName, String portugueseName, String spanishName) {
        this.id = id;
        this.englishName = englishName;
        this.japaneseName = japaneseName;
        this.portugueseName = portugueseName;
        this.spanishName = spanishName;
    }

    public Integer getId() {
        return id;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getJapaneseName() {
        return japaneseName;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public String getSpanishName() {
        return spanishName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypePokemon typeName = (TypePokemon) o;
        return id.equals(typeName.id) &&
                englishName.equals(typeName.englishName) &&
                japaneseName.equals(typeName.japaneseName) &&
                portugueseName.equals(typeName.portugueseName) &&
                spanishName.equals(typeName.spanishName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, englishName, japaneseName, portugueseName, spanishName);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TypeName{");
        sb.append("id=").append(id);
        sb.append(", englishName='").append(englishName).append('\'');
        sb.append(", japaneseName='").append(japaneseName).append('\'');
        sb.append(", portugueseName='").append(portugueseName).append('\'');
        sb.append(", spanishName='").append(spanishName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
