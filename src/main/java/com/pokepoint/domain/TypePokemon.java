package com.pokepoint.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
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

    @OneToMany(mappedBy = "type")
    private List<MovePokemon> moves = new ArrayList<>();

    public TypePokemon() {
    }

    public TypePokemon(Integer id, String englishName, String japaneseName, String portugueseName) {
        this.id = id;
        this.englishName = englishName;
        this.japaneseName = japaneseName;
        this.portugueseName = portugueseName;
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

    public List<MovePokemon> getMoves() {
        return moves;
    }

    public void setMoves(List<MovePokemon> moves) {
        this.moves = moves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypePokemon that = (TypePokemon) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TypeName{");
        sb.append("id=").append(id);
        sb.append(", englishName='").append(englishName).append('\'');
        sb.append(", japaneseName='").append(japaneseName).append('\'');
        sb.append(", portugueseName='").append(portugueseName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
