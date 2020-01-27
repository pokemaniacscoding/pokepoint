package com.pokepoint;

import com.pokepoint.domain.MovePokemon;
import com.pokepoint.domain.TypePokemon;
import com.pokepoint.domain.dto.MovePokemonDTO;
import com.pokepoint.repository.MovePokemonRepository;
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

    @Autowired
    MovePokemonRepository movePokemonRepository;

    public static void main(String[] args) {
        SpringApplication.run(PokepointApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TypePokemon normal = new TypePokemon(null, "Normal", "ノーマルタイプ", "Normal");
        TypePokemon steel = new TypePokemon(null, "Steel", "はがねタイプ", "Aço");
        TypePokemon fire = new TypePokemon(null, "Fire", "ほのおタイプ", "Fogo");
        TypePokemon dragon = new TypePokemon(null, "Dragon", "ドラゴンタイプ", "Dragão");
        TypePokemon ghost = new TypePokemon(null, "Ghost", "ゴーストタイプ", "Fantasma");

        MovePokemon dragonClaw = new MovePokemon(null, "Dragon Claw", "ドラゴンクロー", "Garra de Dragão", 100, 80, 15, 25, dragon);
        MovePokemon flamethrower = new MovePokemon(null, "Flamethrower", "かえんほうしゃ", "Lança Chamas", 100, 90, 15, 25, fire);
        MovePokemon shadowClaw = new MovePokemon(null, "Shadow Claw", "シャドークロー", "", 100, 70, 15, 24, ghost);
        MovePokemon ironTail = new MovePokemon(null, "Iron Tail", "アイアンテール", "", 75, 100, 15, 24, steel);
        MovePokemon gigaImpact = new MovePokemon(null, "Giga Impact", "ギガインパクト", "", 90, 150, 5, 8, normal);

        dragon.getMoves().addAll(Arrays.asList(dragonClaw));
        fire.getMoves().addAll(Arrays.asList(flamethrower));
        normal.getMoves().addAll(Arrays.asList(gigaImpact));
        ghost.getMoves().addAll(Arrays.asList(shadowClaw));
        steel.getMoves().addAll(Arrays.asList(ironTail));

        typePokemonRepository.saveAll(Arrays.asList(normal, steel, fire, dragon, ghost));
        movePokemonRepository.saveAll(Arrays.asList(dragonClaw, flamethrower, shadowClaw, ironTail, gigaImpact));
    }

}
