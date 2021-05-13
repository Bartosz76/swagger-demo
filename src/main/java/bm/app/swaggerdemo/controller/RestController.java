package bm.app.swaggerdemo.controller;

import bm.app.swaggerdemo.model.Pokemon;
import bm.app.swaggerdemo.repository.PokemonRepo;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {

    private PokemonRepo pokemonRepo;

    public RestController(PokemonRepo pokemonRepo) {
        this.pokemonRepo = pokemonRepo;
    }

    @GetMapping("/hello")
    public String helloPage() {
        return "Hello!";
    }

    @PostMapping("/post/{name}/{type}/{powerLevel}")
    public Pokemon addPokemon(@PathVariable String name,
                              @PathVariable String type,
                              @PathVariable int powerLevel) {
        Pokemon pokemon = new Pokemon(name, type, powerLevel);
        pokemonRepo.addAPokemonToList(pokemon);
        return new Pokemon(name, type, powerLevel);
    }

    @GetMapping("/getPokemon")
    public List<Pokemon> getAFewPokemon() {
        return pokemonRepo.getPokemonList();
    }
}
