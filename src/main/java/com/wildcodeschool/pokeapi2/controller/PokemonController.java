package com.wildcodeschool.pokeapi2.controller;

import com.wildcodeschool.pokeapi2.entity.Pokemon;
import com.wildcodeschool.pokeapi2.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/create/pokemon")
    @ResponseBody
    public Pokemon createPokemon() {

        Pokemon test = new Pokemon();
        test.setName("Testomon");
        test.setHp(42);

        return pokemonRepository.save(test);
    }
}
