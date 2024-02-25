import java.util.Random;

public class GuessNumber {

    public static void play_game() {
        Random rand = new Random();
        int guess = rand.nextInt(100);
        System.out.println("Choose your language");
        System.out.println(" 1. English");
        System.out.println(" 2. Español");
        System.out.println(" 3. Français");
        System.out.println(" 4. 简体中文");
    }

    public static void main(String[] args) throws Exception {
        play_game();
    }
}
