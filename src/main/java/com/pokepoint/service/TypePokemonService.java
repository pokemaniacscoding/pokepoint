package com.pokepoint.service;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.exception.ObjectNotFoundException;
import com.pokepoint.repository.TypePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort.Direction;

import java.util.List;
import java.util.Optional;

@Service
public class TypePokemonService {

    @Autowired
    private TypePokemonRepository repo;

    public TypePokemon find(String param) {
        Optional<TypePokemon> obj;
        try {
            obj = repo.findById(Integer.parseInt(param));
        } catch (Exception e){
            obj = repo.findByEnglishName(param);
        }
        return obj.orElseThrow(() -> new ObjectNotFoundException("Tipo de Pokemon não encontrada"));
    }

    public List<TypePokemon> findAll(){
        return repo.findAll();
    }

    public Page<TypePokemon> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
        return repo.findAll(pageRequest);
    }

    public TypePokemon insert(TypePokemon type){
        type.setId(null);
        return repo.save(type);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
