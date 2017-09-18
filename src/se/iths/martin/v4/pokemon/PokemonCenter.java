package se.iths.martin.v4.pokemon;

import java.security.Policy;
import java.util.ArrayList;

public class PokemonCenter {

    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    private void start() {
        initialize();
    }
    public void healPokemon(Pikachu p) {
        p.setHealth(100);
        System.out.println("A " + p.getClass().getSimpleName() + " healed.");
        System.out.println("Also known as " + p.getNickname());
    }

    public void healPokemon(Pokemon p) {
        p.setHealth(100);
        System.out.println("A " + p.getClass().getSimpleName() + " healed.");
    }

    private void initialize() {
        pokemons.add(new Pikachu("Bertil"));
        pokemons.add(new Pikachu("Sune"));
        pokemons.add(new Muk());

        for (Pokemon p : pokemons) {
            p.talk();
            p.attack();
            if( p instanceof Pikachu)
                healPokemon((Pikachu)p);
            else
                healPokemon(p);
        }

    }

    public static void main(String[] args) {
        new PokemonCenter().start();
    }
}
