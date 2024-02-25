import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public Scanner sc;

    public GuessNumber() {
        this.sc = new Scanner(System.in);
    }

    public void play_game() throws Exception {
        final int BOUND = 100;
        Random rand = new Random();
        int guess = rand.nextInt(BOUND);
        Language lang = new English();
        System.out.println("Choose your language");
        System.out.println(" 1. English");
        System.out.println(" 2. Español");
        System.out.println(" 3. Français");
        System.out.println(" 4. 简体中文");
        int choice = readUserIntInput(1,4);
        switch (choice) {
            case 1:
                lang = new English();
                break;
            case 2:
                lang = new Spanish();
                break;
            case 3:
                lang = new French();
                break;
            case 4:
                lang = new SimplifiedChinese();
                break;
            default:
                throw new Exception("Error resolving choice!");
        }

        System.out.print(lang.make_guess() + "\n > ");
        int userGuess = readUserIntInput(0, BOUND);
    }
    
    /**
     * Reads user input until a valid integer is read, handling exceptions & out of bounds choices. 
     * @param min the minimum number the user can input, inclusive
     * @param max the maximum number the user can input, inclusive
     * @return the user's input
     */
    public int readUserIntInput(int min, int max) {
        int input = -1;
        while (true) {
            try {
                input = this.sc.nextInt();
                this.sc.nextLine();
                if (input <= max && input >= min)
                    break;
                else
                    System.out.println("Input out of bounds!");
            } catch (Exception e) {
                System.out.println("Invalid Input. Try again!");
                this.sc.nextLine();
            }
        }
        return input;
    }

    public static void main(String[] args) throws Exception {
        GuessNumber game = new GuessNumber();
        game.play_game();
    }
}
