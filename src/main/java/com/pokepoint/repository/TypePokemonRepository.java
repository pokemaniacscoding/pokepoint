package com.pokepoint.repository;

import com.pokepoint.domain.TypePokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypePokemonRepository extends JpaRepository<TypePokemon, Integer> {
    @Query("SELECT t FROM TypePokemon t WHERE t.englishName = ?1")
    Optional<TypePokemon> findByEnglishName(String englishName);
}
