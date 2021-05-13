package bm.app.swaggerdemo.controller;

import bm.app.swaggerdemo.model.Pokemon;
import bm.app.swaggerdemo.repository.PokemonRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private PokemonRepo pokemonRepo;

    public RestController(PokemonRepo pokemonRepo) {
        this.pokemonRepo = pokemonRepo;
    }

    @GetMapping("/hello")
    @ApiOperation(value = "Just a greeting!", notes = "Just welcomes you.", response = String.class)
    public String helloPage() {
        return "Hello! Welcome to Pokemon API!";
    }

    @PostMapping("/{name}/{type}/{powerLevel}")
    @ApiOperation(value = "Adds a new pokemon to the 'database'.", notes = "Provide the name of the pokemon, along with its type and the powerlevel to have it added.", response = Pokemon.class)
    public Pokemon addPokemon(@PathVariable String name,
                              @PathVariable String type,
                              @PathVariable int powerLevel) {
        Pokemon pokemon = new Pokemon(name, type, powerLevel);
        pokemonRepo.addAPokemonToList(pokemon);
        return new Pokemon(name, type, powerLevel);
    }

    @GetMapping("/getPokemon")
    @ApiOperation(value = "Show the current content of the list of Pokemon.", notes = "Gotta get them all!", response = List.class)
    public List<Pokemon> getAFewPokemon() {
        return pokemonRepo.getPokemonList();
    }
}
