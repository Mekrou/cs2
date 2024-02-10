import java.util.Scanner;

public class Driver {
    private static Scanner sc;

    public static void main(String[] args) {
        Checking checking = new Checking(0);
        Savings savings = new Savings(0);
        int input = 0;
        Scanner sc = new Scanner(System.in);
        do {
            display_menu();
            try {
                input = sc.nextInt();
                sc.nextLine();
                switch (input) {
                    case 1:
                        withdrawling(checking);
                        break;
                    case 2:
                        withdrawling(savings);
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Thank you for banking with us today!");
                        break;
                    default:
                        throw new Exception("Choices are between 1-8!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input detected: ");
                System.out.println("  " + e);
            } 
            sc.close();
        } while (input != 8);
    }

    public static void display_menu()
    {
        System.out.println("1. Withdraw from Checking");
        System.out.println("2. Withdraw from Savings");
        System.out.println("3. Deposit to Checking");
        System.out.println("4. Deposit to Savings");
        System.out.println("5. Balance of Checking");
        System.out.println("6. Balance of Savings");
        System.out.println("7. Award Interest to Savings now");
        System.out.println("8. Quit");

        System.out.println();

        System.out.print("> ");
    }

    public static void withdrawling(Account typeOfAccount) {
        System.out.println("How much would you like to withdraw?");
        float input = readFloatInput();
    }

    public static void depositing(Account typeOfAccount) {

    }

    public static void checkingBalance(Account typeOfAccount) {

    }

    public static void awardInterest() {

    }

    public static float readFloatInput() {
        boolean isInvalidInput = true;
        float input = 0.0f;
        do {
            try (Scanner sc = new Scanner(System.in)) {
                input = sc.nextFloat();
                isInvalidInput = false;
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
            }
        } while (isInvalidInput);

        return input;
    }
}
