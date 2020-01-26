package com.pokepoint.domain.dto;

import com.pokepoint.domain.MovePokemon;
import com.pokepoint.domain.TypePokemon;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypePokemonDTO {

    private String englishName;
    private String japaneseName;
    private String portugueseName;

    public TypePokemonDTO(TypePokemon typePokemon) {
        this.englishName = typePokemon.getEnglishName();
        this.japaneseName = typePokemon.getJapaneseName();
        this.portugueseName = typePokemon.getPortugueseName();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getJapaneseName() {
        return japaneseName;
    }

    public void setJapaneseName(String japaneseName) {
        this.japaneseName = japaneseName;
    }

    public String getPortugueseName() {
        return portugueseName;
    }

    public void setPortugueseName(String portugueseName) {
        this.portugueseName = portugueseName;
    }
}
