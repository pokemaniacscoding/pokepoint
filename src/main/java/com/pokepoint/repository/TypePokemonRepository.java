package com.pokepoint.repository;

import com.pokepoint.domain.TypePokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePokemonRepository extends JpaRepository<TypePokemon, Integer> {
}
