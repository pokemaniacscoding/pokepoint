package com.pokepoint.domain.dto;

import com.pokepoint.domain.TypePokemon;

import java.io.Serializable;

public class TypePokemonDTO implements Serializable {
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
