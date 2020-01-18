package com.pokepoint.service;

import com.pokepoint.domain.MovePokemon;
import com.pokepoint.repository.MovePokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovePokemonService {

    @Autowired
    private MovePokemonRepository repo;

    public List<MovePokemon> findAll(){
        return repo.findAll();
    }

    public MovePokemon find(Integer id){
        Optional<MovePokemon> obj = this.repo.findById(id);
        return obj.orElse(null);
    }
}
