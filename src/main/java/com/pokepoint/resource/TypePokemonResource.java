package com.pokepoint.resource;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.service.TypePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/type")
public class TypePokemonResource {

    @Autowired
    private TypePokemonService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<TypePokemon> findAll() {
        return this.service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        TypePokemon typePokemon = this.service.find(id);
        return ResponseEntity.ok().body(typePokemon);
    }
}
