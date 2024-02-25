import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Scanner sc;
    private final int BOUND = 100;
    private final int guess;
    private Language lang;

    public GuessNumber() {
        Random rand = new Random();
        this.guess = rand.nextInt(BOUND);
        this.sc = new Scanner(System.in);
    }

    public void play_game() throws Exception {
        getUserLanguage();

        boolean guessing = true;
        while (guessing) {
            System.out.print(lang.make_guess() + "\n > ");
            int userGuess = readUserIntInput(0, BOUND);
            String guessResult = resolveGuess(userGuess);
            if (guessResult.equals("correct")) {
                System.out.println(lang.correct());
                guessing = false;
            } else if (guessResult.equals("too high")) {
                System.out.println(lang.too_high());
            } else if (guessResult.equals("too low")) {
                System.out.println(lang.too_low());
            } 
        }
    }

    private void getUserLanguage() throws Exception {
        System.out.println("Choose your language");
        System.out.println(" 1. English");
        System.out.println(" 2. Español");
        System.out.println(" 3. Français");
        System.out.println(" 4. 简体中文");
        int choice = readUserIntInput(1,4);
        switch (choice) {
            case 1:
                this.lang = new English();
                break;
            case 2:
                this.lang = new Spanish();
                break;
            case 3:
                this.lang = new French();
                break;
            case 4:
                this.lang = new SimplifiedChinese();
                break;
            default:
                throw new Exception("Error resolving language choice!");
        }
    }
    
    private String resolveGuess(int userGuess) {
        if (userGuess == this.guess) {
            return "correct";
        } else if (userGuess > this.guess) {
            return "too high";
        } else if (userGuess < this.guess) {
            return "too low";
        } else 
            return "";
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
}
