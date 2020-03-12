package com.pokepoint.repository;

import com.pokepoint.domain.MovePokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovePokemonRepository extends JpaRepository<MovePokemon, Integer> {

    List<MovePokemon> findByTypeEnglishName(String nameMove);
}
