package bm.app.swaggerdemo.controller;

import bm.app.swaggerdemo.model.Pokemon;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {

    @GetMapping("/hello")
    public String helloPage() {
        return "Hello!";
    }

    @PostMapping("/post/{name}/{type}/{powerLevel}")
    public Pokemon addPokemon(@PathVariable String name,
                              @PathVariable String type,
                              @PathVariable int powerLevel) {
        return new Pokemon(name, type, powerLevel);
    }

    @GetMapping("/getPokemon")
    public List<Pokemon> getAFewPokemon() {
        return Arrays.asList(
                new Pokemon("Cyndaquil", "Fire", 10),
                new Pokemon("Pikachu", "Electric", 12),
                new Pokemon("Lucario", "Fighting/Steel", 30)
        );
    }
}
