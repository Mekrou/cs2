import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            spawn();
        }
    }

    public static Pokemon spawn() {
        Random random = new Random();
        final int level = random.nextInt(20) + 1;
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

    public static float throwBall() {
        System.out.println("What type of ball do you wish to use?\n (Poke, Great, Ultra)  >");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        float ballMultiplier = 0.0f;
        float berryMultiplier = 0.0f;
        float curveMultiplier = 0.0f;
        switch (input) {
            case "Poke":
                ballMultiplier = 1f;
                break;
            case "Great":
                ballMultiplier = 1.5f;
                break;
            case "Ultra":
                ballMultiplier = 2;
                break;
            default:
                break;
        }
        System.out.println("Which berry?\n (None, Razz, SilverPinap, GoldenRazz)  >");
        input = sc.next();
        switch (input) {
            case "Razz":
                berryMultiplier = 1.5f;
                break;
            case "SilverPinap":
                berryMultiplier = 1.8f;
                break;
            case "GoldenRazz":
                berryMultiplier = 2.5f;
                break;
            default:
                berryMultiplier = 1f;
                break;
        }
        System.out.println("Is it a curveball?\n  (Yes or No)  >");
        input = sc.next();
        if (input == "Yes") {
            curveMultiplier = 1.7f;
        } else if (input == "No") {
            curveMultiplier = 1f;
        } else {
            System.out.println("Invalid input! exiting...");
        }

        return ballMultiplier * berryMultiplier * curveMultiplier;
    }
}
