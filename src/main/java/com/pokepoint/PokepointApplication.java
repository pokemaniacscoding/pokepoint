package com.pokepoint;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.repository.TypePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PokepointApplication implements CommandLineRunner {

    @Autowired
    TypePokemonRepository typePokemonRepository;

    public static void main(String[] args) {
        SpringApplication.run(PokepointApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TypePokemon normal = new TypePokemon(null, "Normal", "ノーマルタイプ", "Normal");
        TypePokemon fighting = new TypePokemon(null, "Fighting", "かくとうタイプ", "lutador");
        TypePokemon flying = new TypePokemon(null, "Flying", "ひこうタイプ", "Voador");
        TypePokemon poison = new TypePokemon(null, "Poison", "どくタイプ", "Venenoso");
        TypePokemon ground = new TypePokemon(null, "Ground", "じめんタイプ", "Terra");
        TypePokemon rock = new TypePokemon(null, "Rock", "いわタイプ", "Pedra");
        TypePokemon bug = new TypePokemon(null, "Bug", "むしタイプ", "Inseto");
        TypePokemon ghost = new TypePokemon(null, "Ghost", "ゴーストタイプ", "Fantasma");
        TypePokemon steel = new TypePokemon(null, "Steel", "はがねタイプ", "Aço");
        TypePokemon fire = new TypePokemon(null, "Fire", "ほのおタイプ", "Fogo");
        TypePokemon water = new TypePokemon(null, "Water", "みずタイプ", "Água");
        TypePokemon grass = new TypePokemon(null, "Grass", "くさタイプ", "Grama");
        TypePokemon electric = new TypePokemon(null, "Electric", "でんきタイプ", "Elétrico");
        TypePokemon psychic = new TypePokemon(null, "Psychic", "エスパータイプ", "Psiquico");
        TypePokemon ice = new TypePokemon(null, "Ice", "こおりタイプ", "Gelo");
        TypePokemon dragon = new TypePokemon(null, "Dragon", "ドラゴンタイプ", "Dragão");
        TypePokemon dark = new TypePokemon(null, "Dark", "あくタイプ", "Trevas");
        TypePokemon fairy = new TypePokemon(null, "Fairy", "フェアリータイプ", "Fada");
        typePokemonRepository.saveAll(Arrays.asList(normal, fighting, flying, poison, ground, rock, bug, ghost, steel, fire, water, grass, electric, psychic, ice, dragon, dark, fairy));
    }

}
