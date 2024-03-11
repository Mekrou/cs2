import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args) {
        System.out.println(repeatNTimes("I must study recusion until it makes sense\n", 100));

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first string: ");
            String firstString = sc.nextLine();
            System.out.print("Enter the second string: ");
            String secondString = sc.nextLine();

            boolean result = isReverse(firstString, secondString);
            System.out.println(result ? firstString + " is the reverse of " + secondString
                    : firstString + " is not the reverse of " + secondString);

            System.out.println();
        } catch (InputMismatchException e) {
            System.out.print("Invalid input! Try again: ");
            sc.nextLine();
        }
        sc.close();
    }

    public static String repeatNTimes(String message, int amount) {
        if (amount == 0)
            return "";
        return message + repeatNTimes(message, amount - 1);
    }

    public static boolean isReverse(String a, String b) {
        if (a.length() != b.length()) // non-equal lengths cannot be reverses
            return false;
        if (a.length() == 0 || b.length() == 0) // empty strings
            return true;

        // first char to last char
        if (a.charAt(0) == b.charAt(b.length() - 1))
            // forget about the first char forget about the last char
            return isReverse(a.substring(1, a.length()), b.substring(0, b.length() - 1));
        else
            return false;
    }
}
