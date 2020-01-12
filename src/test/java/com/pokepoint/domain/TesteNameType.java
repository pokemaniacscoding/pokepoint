package com.pokepoint.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteNameType {
    private static final Integer ID = 1;
    private static final String ENGLISH_NAME = "Dragon ";
    private static final String JAPANESE_NAME = "ドラゴンタイプ";
    private static final String PORTUGUESE_NAME = "Dragão";
    private static final String SPANISH_NAME = "Dragón";

    @Test
    public void criarObjeto(){
        TypeName typeName = new TypeName(ID, ENGLISH_NAME, JAPANESE_NAME, PORTUGUESE_NAME, SPANISH_NAME);
        assertEquals(typeName.getId(), ID);
        assertEquals(typeName.getEnglishName(), ENGLISH_NAME);
        assertEquals(typeName.getJapaneseName(), JAPANESE_NAME);
        assertEquals(typeName.getPortugueseName(), PORTUGUESE_NAME);
        assertEquals(typeName.getSpanishName(), SPANISH_NAME);
        System.out.println(typeName);
    }
}
