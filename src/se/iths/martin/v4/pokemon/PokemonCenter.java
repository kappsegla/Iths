package se.iths.martin.v4.pokemon;

import java.security.Policy;
import java.util.ArrayList;

public class PokemonCenter {

    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    private void start() {
        initialize();
    }

    private void initialize() {
        pokemons.add(new Pikachu("Bertil"));
        pokemons.add(new Pikachu("Sune"));

        pokemons.get(0).talk();
        pokemons.get(0).attack();

        pokemons.get(1).talk();
        pokemons.get(1).attack();

    }

    public static void main(String[] args){
        new PokemonCenter().start();
    }
}
