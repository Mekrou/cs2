import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            spawn();
        }
    }

    public static Pokemon spawn() {
        Random random = new Random();
        final int level = random.nextInt(21);
        final int pokemonSwitch = random.nextInt(3) + 1;
        Pokemon pokemon;
        switch (pokemonSwitch) {
            case 1:
                pokemon = new Bulbasaur(level);
                break;
            case 2:
                pokemon = new Charmander(level);
                break;
            case 3:
                pokemon = new Caterpie(level);
                break;
            default:
            pokemon = new Caterpie(level);
                break;
        }

        System.out.println("You encounter a level " + pokemon.getLevel() + " " + pokemon.getName());
        return pokemon;
    }
}
