package com.pokepoint.repository;

import com.pokepoint.domain.MovePokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovePokemonRepository extends JpaRepository<MovePokemon, Integer> {
}
