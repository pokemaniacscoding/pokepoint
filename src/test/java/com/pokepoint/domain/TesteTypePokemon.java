package com.pokepoint.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteTypePokemon {
    private static final Integer ID = 1;
    private static final String ENGLISH_NAME = "Dragon";
    private static final String JAPANESE_NAME = "ドラゴンタイプ";
    private static final String PORTUGUESE_NAME = "Dragão";

    @Test
    public void criarObjeto(){
        TypePokemon typeName = new TypePokemon(ID, ENGLISH_NAME, JAPANESE_NAME, PORTUGUESE_NAME);
        assertEquals(typeName.getId(), ID);
        assertEquals(typeName.getEnglishName(), ENGLISH_NAME);
        assertEquals(typeName.getJapaneseName(), JAPANESE_NAME);
        assertEquals(typeName.getPortugueseName(), PORTUGUESE_NAME);
        System.out.println(typeName);
    }
}
