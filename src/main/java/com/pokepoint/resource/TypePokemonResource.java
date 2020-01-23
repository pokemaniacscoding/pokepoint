package com.pokepoint.resource;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.domain.dto.TypePokemonDTO;
import com.pokepoint.service.TypePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/type")
public class TypePokemonResource {

    @Autowired
    private TypePokemonService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<TypePokemonDTO> findAll() {
        List<TypePokemon> lista = this.service.findAll();
        List<TypePokemonDTO> listaDTO = lista.stream().map(obj -> new TypePokemonDTO(obj)).collect(Collectors.toList());
        return listaDTO;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        TypePokemon typePokemon = this.service.find(id);
        return ResponseEntity.ok().body(typePokemon);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable String name){
        TypePokemon obj = this.service.find(name);
        return ResponseEntity.ok().body(obj);
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

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> insert(@Valid @RequestBody TypePokemon type){
        TypePokemon obj = service.insert(type);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
