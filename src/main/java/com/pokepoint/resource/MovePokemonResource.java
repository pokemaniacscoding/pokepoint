package com.pokepoint.resource;

import com.pokepoint.domain.MovePokemon;
import com.pokepoint.domain.dto.MovePokemonDTO;
import com.pokepoint.service.MovePokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ResponseEntity<?> findPage(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "6") Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "englishName") String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") String direction
    ) {
        Page<MovePokemon> lista = this.service.findPage(page, linesPerPage, orderBy, direction);
        Page<MovePokemonDTO> listaDTO = lista.map(obj -> new MovePokemonDTO(obj));
        return ResponseEntity.ok().body(listaDTO);
    }
}
