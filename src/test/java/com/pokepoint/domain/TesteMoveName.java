package com.pokepoint.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteMoveName {
	private static final Integer ID = 1;
	private static final String ENGLISH_NAME = "Dragon Claw";
	private static final String JAPANESE_NAME = "ドラゴンクロー";
	private static final String PORTUGUESE_NAME = "Garra de Dragão";

	@Test
	public void criarObjeto() {
		MoveName moveName = new MoveName(ID, ENGLISH_NAME, JAPANESE_NAME, PORTUGUESE_NAME);
		assertEquals(moveName.getId(), ID);
		assertEquals(moveName.getEnglishName(), ENGLISH_NAME);
		assertEquals(moveName.getJapaneseName(), JAPANESE_NAME);
		assertEquals(moveName.getPortugueseName(), PORTUGUESE_NAME);
		System.out.println(moveName);
	}
}
