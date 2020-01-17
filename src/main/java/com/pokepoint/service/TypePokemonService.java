package com.pokepoint.service;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.repository.TypePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypePokemonService {

    @Autowired
    private TypePokemonRepository repo;

    public TypePokemon find(Integer id) {
        Optional<TypePokemon> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public List<TypePokemon> findAll(){
        return repo.findAll();
    }
}
