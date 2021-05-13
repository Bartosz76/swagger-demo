package bm.app.swaggerdemo.repository;

import bm.app.swaggerdemo.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonRepo {

    private final List<Pokemon> pokemonList = new ArrayList<>();

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void addAPokemonToList(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }
}
