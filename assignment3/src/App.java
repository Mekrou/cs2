import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            testSpawn();
        }
    }

    public static int spawn() {
        Random random = new Random();
        final int level = random.nextInt(21);
        final int pokemonSwitch = random.nextInt(3) + 1;
        Pokemon pokemon;
        switch (pokemonSwitch) {
            case 1:
                pokemon = new Bulbasaur(level);
                break;
            case 2:
            
                break;
            case 3:
            
                break;
            default:
                break;
        }

        System.out.println("You encounter a level " pokemon.getLevel() + " " pokemon.getName());
        return pokemonSwitch;
    }

    public static void testSpawn() {
        int number = spawn();
        System.out.println(number);
        if (number > 3) {
            throw new Error("Over 20");
        }
        else if (number < 1) {
            throw new Error("Under 0");
        }
    }
}
