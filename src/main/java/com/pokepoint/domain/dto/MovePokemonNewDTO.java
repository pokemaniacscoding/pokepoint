package com.pokepoint.domain.dto;

import com.pokepoint.validation.MoveInsert;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@MoveInsert
public class MovePokemonNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Valid
    @NotNull
    @NotEmpty(message = "Preenchimento obrigatório!!!")
    private String englishName;

    @NotNull
    @NotEmpty(message = "Preenchimento obrigatório!!!")
    private String japaneseName;

    @NotNull
    @NotEmpty(message = "Preenchimento obrigatório!!!")
    private String portugueseName;

    private Integer accuracy;
    private Integer power;
    private Integer ppMin;
    private Integer ppMax;
    private Integer typeId;

    public MovePokemonNewDTO() {
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getPpMin() {
        return ppMin;
    }

    public void setPpMin(Integer ppMin) {
        this.ppMin = ppMin;
    }

    public Integer getPpMax() {
        return ppMax;
    }

    public void setPpMax(Integer ppMax) {
        this.ppMax = ppMax;
    }

}
