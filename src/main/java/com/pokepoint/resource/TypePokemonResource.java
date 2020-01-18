package com.pokepoint.resource;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.service.TypePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public Page<TypePokemon> findPage(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "6") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "englishName") String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction
    ) {
        return this.service.findPage(page, linesPerPage, orderBy, direction);
    }
}
