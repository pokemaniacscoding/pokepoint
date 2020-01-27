package com.pokepoint.domain.dto;

import com.pokepoint.domain.MovePokemon;

import java.io.Serializable;

public class MovePokemonDTO{

    private String englishName;
    private String japaneseName;
    private String portugueseName;
    private Integer accuracy;
    private Integer power;
    private Integer ppMin;
    private Integer ppMax;
    private String type;

    public MovePokemonDTO(MovePokemon movePokemon){
        this.englishName = movePokemon.getEnglishName();
        this.japaneseName = movePokemon.getJapaneseName();
        this.portugueseName = movePokemon.getPortugueseName();
        this.accuracy = movePokemon.getAccuracy();
        this.power = movePokemon.getPower();
        this.ppMin = movePokemon.getPpMin();
        this.ppMax = movePokemon.getPpMax();
        this.type = movePokemon.getType().getEnglishName();
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

    public Integer getAccuracy() {
        return accuracy;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getPpMin() {
        return ppMin;
    }

    public Integer getPpMax() {
        return ppMax;
    }

    public String getType() {
        return type;
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

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setPpMin(Integer ppMin) {
        this.ppMin = ppMin;
    }

    public void setPpMax(Integer ppMax) {
        this.ppMax = ppMax;
    }

    public void setType(String type) {
        this.type = type;
    }
}
