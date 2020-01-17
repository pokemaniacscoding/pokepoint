package com.pokepoint.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="move")
public class MovePokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String englishName;
    private String japaneseName;
    private String portugueseName;
    private Integer accuracy;
    private Integer power;
    private Integer pp;

    public MovePokemon() {
    }

    public MovePokemon(Integer id, String englishName, String japaneseName, String portugueseName, Integer accuracy, Integer power, Integer pp) {
        this.id = id;
        this.englishName = englishName;
        this.japaneseName = japaneseName;
        this.portugueseName = portugueseName;
        this.accuracy = accuracy;
        this.power = power;
        this.pp = pp;
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

    public Integer getPp() {
        return pp;
    }

    public Integer getAccuracy() {
        return this.accuracy;
    }

    public Integer getPower() {
        return this.power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovePokemon that = (MovePokemon) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(englishName, that.englishName) &&
                Objects.equals(japaneseName, that.japaneseName) &&
                Objects.equals(portugueseName, that.portugueseName) &&
                Objects.equals(accuracy, that.accuracy) &&
                Objects.equals(power, that.power) &&
                Objects.equals(pp, that.pp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, englishName, japaneseName, portugueseName, accuracy, power, pp);
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
        sb.append(", pp=").append(pp);
        sb.append('}');
        return sb.toString();
    }
}
