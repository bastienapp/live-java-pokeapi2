package com.wildcodeschool.pokeapi2.repository;

import com.wildcodeschool.pokeapi2.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
