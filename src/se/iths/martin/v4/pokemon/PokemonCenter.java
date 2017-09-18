package se.iths.martin.v4.pokemon;

import java.security.Policy;
import java.util.ArrayList;

public class PokemonCenter {

    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    private void start() {
        initialize();
    }

    private void initialize() {
        pokemons.add(new Pikachu());
        pokemons.add(new Muk());

    }

    public static void main(String[] args){
        new PokemonCenter().start();
    }
}
