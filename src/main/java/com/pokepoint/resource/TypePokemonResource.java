package com.pokepoint.resource;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.service.TypePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/type")
public class TypePokemonResource {

    @Autowired
    private TypePokemonService service;

    @RequestMapping(method = RequestMethod.GET)
    public TypePokemon find(){
        Integer ID = 1;
        String ENGLISH_NAME = "Dragon ";
        String JAPANESE_NAME = "ドラゴンタイプ";
        String PORTUGUESE_NAME = "Dragão";
        String SPANISH_NAME = "Dragón";
        TypePokemon typeName = new TypePokemon(ID, ENGLISH_NAME, JAPANESE_NAME, PORTUGUESE_NAME, SPANISH_NAME);
        return typeName;
    }
}
