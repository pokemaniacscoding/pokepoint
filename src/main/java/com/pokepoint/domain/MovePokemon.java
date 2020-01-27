package com.pokepoint.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "move")
public class MovePokemon implements Serializable {
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
    private Integer accuracy;
    private Integer power;
    private Integer ppMin;
    private Integer ppMax;

    @JsonBackReference
    @ManyToOne
    @JoinTable(name = "MOVE_TYPE",
            joinColumns = @JoinColumn(name = "move_id"), inverseJoinColumns = @JoinColumn(name = "type_id"))
    private TypePokemon type;

    public MovePokemon() {
    }

    public MovePokemon(Integer id, String englishName, String japaneseName, String portugueseName, Integer accuracy, Integer power, Integer ppMin, Integer ppMax, TypePokemon type) {
        this.id = id;
        this.englishName = englishName;
        this.japaneseName = japaneseName;
        this.portugueseName = portugueseName;
        this.accuracy = accuracy;
        this.power = power;
        this.ppMin = ppMin;
        this.ppMax = ppMax;
        this.type = type;
    }

    public Integer getId() {
        return this.id;
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

    public Integer getPpMin() {
        return ppMin;
    }

    public Integer getPpMax() {
        return ppMax;
    }

    public TypePokemon getType() {
        return this.type;
    }

    public Integer getAccuracy() {
        return this.accuracy;
    }

    public Integer getPower() {
        return this.power;
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

    public void setType(TypePokemon type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovePokemon that = (MovePokemon) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(englishName, that.englishName) &&
                Objects.equals(japaneseName, that.japaneseName) &&
                Objects.equals(portugueseName, that.portugueseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, englishName, japaneseName, portugueseName);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MovePokemon{");
        sb.append("id=").append(id);
        sb.append(", englishName='").append(englishName).append('\'');
        sb.append(", japaneseName='").append(japaneseName).append('\'');
        sb.append(", portugueseName='").append(portugueseName).append('\'');
        sb.append(", accuracy=").append(accuracy);
        sb.append(", power=").append(power);
        sb.append(", ppMin=").append(ppMin);
        sb.append(", ppMax=").append(ppMax);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
