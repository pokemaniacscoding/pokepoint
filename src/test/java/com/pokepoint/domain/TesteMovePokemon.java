package com.pokepoint.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteMovePokemon {
    private static final Integer ID = 1;
    private static final Integer ACCURACY = 100;
    private static final Integer POWER = 80;
    private static final Integer PP_MIN = 15;
    private static final Integer PP_MAX = 25;
    private static final String ENGLISH_NAME = "Dragon Claw";
    private static final String JAPANESE_NAME = "ドラゴンクロー";
    private static final String PORTUGUESE_NAME = "Garra de Dragão";

    @Test
    public void criarObjeto() {
        TypePokemon type = new TypePokemon(1, "Dragon", "ドラゴンタイプ", "Dragão");
        MovePokemon obj = new MovePokemon(ID,ENGLISH_NAME, JAPANESE_NAME, PORTUGUESE_NAME, ACCURACY, POWER, PP_MIN, PP_MAX, type);

        assertEquals(obj.getId(), ID);
        assertEquals(obj.getEnglishName(), ENGLISH_NAME);
        assertEquals(obj.getJapaneseName(), JAPANESE_NAME);
        assertEquals(obj.getPortugueseName(), PORTUGUESE_NAME);
        assertEquals(obj.getAccuracy(), ACCURACY);
        assertEquals(obj.getPower(), POWER);
        assertEquals(obj.getPpMin(), PP_MIN);
        assertEquals(obj.getPpMax(), PP_MAX);

        System.out.println(obj);
    }
}
