import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> myPokemon;

    public Pokedex() {
        this.myPokemon = new ArrayList<Pokemon>();
    }

    public void addToDex(Pokemon pokemon) {
        myPokemon.add(pokemon);
    }

    public String toString() {
        String pokemons = "";
        for (Pokemon pokemon : myPokemon) {
            pokemons += pokemon + "\n";
        }
        return pokemons;
    }
}
