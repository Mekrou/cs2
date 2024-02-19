import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pokedex myDex = new Pokedex();
        Random random = new Random();
        boolean isPlaying = true;
        while (isPlaying) {
            Pokemon encounter = spawn();
            boolean caught = false;
            while (!caught) {
                float multiplier = throwBall();
                double catchProbability = calculateCatchProbability(encounter.getBaseCatchRate(), multiplier);
                final double randomNum = random.nextFloat();
                if (randomNum < catchProbability) {
                    System.out.println("A level " + encounter.getLevel() + " " +
                            encounter.getName() + " Caught");
                    myDex.addToDex(encounter);
                    caught = true;
                } else {
                    System.out.println("Oops A level " + encounter.getLevel() + " " +
                            encounter.getName() + " jumped out, try again!");
                }
            }

            System.out.println("Continue Catching Pokemon? (Y or N)");
            String input = sc.next();
            sc.nextLine();
            System.out.println(input);
            if (input.equals("N")) {
                isPlaying = false;
            }
        }
        System.out.println("You have the following pokemon:");
        myDex.printPokedex();
        sc.close();
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
        System.out.print("What type of ball do you wish to use?\n (Poke, Great, Ultra)  \n> ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.nextLine();
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
        System.out.print("\nWhich berry?\n (None, Razz, SilverPinap, GoldenRazz)  \n> ");
        input = sc.next();
        sc.nextLine();
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
        System.out.print("\nIs it a curveball?\n  (Yes or No)  \n> ");
        input = sc.next();
        sc.nextLine();
        switch (input) {
            case "Yes":
                curveMultiplier = 1.7f;
                break;
            default:
                curveMultiplier = 1f;
                break;
        }
        return ballMultiplier * berryMultiplier * curveMultiplier;
    }

    public static double calculateCatchProbability(double baseCatchRate, float multipliers) {
        final float cpm = 0.49985844f;
        return Math.pow(1 - (1 - (baseCatchRate / (2 * cpm))), multipliers);
    }
}
