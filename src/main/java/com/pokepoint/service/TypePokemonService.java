package com.pokepoint.service;

import com.pokepoint.domain.TypePokemon;
import com.pokepoint.repository.TypePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypePokemonService {

    @Autowired
    private TypePokemonRepository repo;

    public Optional<TypePokemon> find(Integer id) {
        return repo.findById(id);
    }
}
