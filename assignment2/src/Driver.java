import java.util.Scanner;

public class Driver {
    private Scanner sc;
    private int length;
    private int gameType;
    private WheelOfFortune game;

    public Driver() {
        this.sc = new Scanner(System.in);
        this.length = 0;
        this.gameType = 0;
        this.game = new WheelOfFortune();

        askForLength();
        displayMenu();
        resolveChoice();
    }

    public void askForLength() {
        System.out.print("How many letters are in the word?\n> ");
        length = sc.nextInt();
        sc.nextLine();
    }

    public void displayMenu() {
        System.out.println("Do you want me to look for letters or a pattern?");
        System.out.println("1. Letters");
        System.out.println("2. Pattern");
        System.out.print("> ");
        gameType = sc.nextInt();
        sc.nextLine();
    }

    public void resolveChoice() {
        switch (gameType) {
            case 1:
                letters();
                break;
            case 2:
                pattern();
                break;
        }
    }

    private void letters() {
        System.out.print("What letters are in the word?\n> ");
        String letters = sc.next();
        sc.nextLine();

        System.out.println("It may be any of these...");
        game.guessWordWithLetters(new English(), this.length, letters);
    }

    private void pattern() {
        System.out.print("What pattern is in the word?\n> ");
        String pattern = sc.next();
        sc.nextLine();

        System.out.println("It may be any of these...");
        game.guessWordWithPattern(new English(), this.length, pattern);
    }
}
