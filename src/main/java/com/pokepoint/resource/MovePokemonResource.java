package com.pokepoint.resource;

import com.pokepoint.domain.MovePokemon;
import com.pokepoint.domain.dto.MovePokemonDTO;
import com.pokepoint.service.MovePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/move")
public class MovePokemonResource {

    @Autowired
    private MovePokemonService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<MovePokemonDTO> findAll(){
        List<MovePokemon> lista = this.service.findAll();
        List<MovePokemonDTO> listaDTO = lista.stream().map(obj -> new MovePokemonDTO(obj)).collect(Collectors.toList());
        return listaDTO;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        MovePokemon obj = this.service.find(id);
        MovePokemonDTO objDTO = new MovePokemonDTO(obj);
        return ResponseEntity.ok().body(objDTO);
    }
}
