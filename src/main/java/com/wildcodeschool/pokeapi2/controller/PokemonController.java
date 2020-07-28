package com.wildcodeschool.pokeapi2.controller;

import com.wildcodeschool.pokeapi2.entity.Pokemon;
import com.wildcodeschool.pokeapi2.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/")
    public List<Pokemon> getAll() {

        return pokemonRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pokemon> getOne(@PathVariable Long id) {

        return pokemonRepository.findById(id);
    }

    @PostMapping("/")
    public Pokemon postOne(@RequestBody Pokemon pokemon) {

        return pokemonRepository.save(pokemon);
    }

    @PutMapping("/")
    public Pokemon updateOne(@RequestBody Pokemon pokemon) {

        if (pokemonRepository.existsById(pokemon.getId())) {
            return pokemonRepository.save(pokemon);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteOne(@PathVariable Long id) {

        pokemonRepository.deleteById(id);
    }
}
