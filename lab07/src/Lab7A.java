import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7A {
    public static int recursive_multiply(int a, int b) {
        if (b == 1) {
            return a;
        } else if (a == 0 || b == 0) {
            return 0;
        }

        return a + recursive_multiply(a, b - 1);
    }

    public static int recursive_div(int a, int b) {
        if (b == 0)
            return -1;
        if (a == b)
            return 1;
        if (a < b)
            return 0;

        return 1 + recursive_div(a - b, b);
    }

    public static int recursive_mod(int a, int b) {
        if (b == 0)
            return -1;
        if (a == b)
            return 1;
        if (a < b)
            return a;

        return recursive_mod(a - b, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Choose from the following:");
                System.out.println("0. Quit");
                System.out.println("1. Multiply 2 numbers");
                System.out.println("2. Divide 2 numbers");
                System.out.println("3. Mod 2 numbers");

                int input = sc.nextInt();
                sc.nextLine();
                System.out.println();

                if (input == 0) {
                    System.out.println("Quitting...");
                    break;
                }

                System.out.print("First number: ");
                int a = sc.nextInt();
                sc.nextLine();
                System.out.print("Second number: ");
                int b = sc.nextInt();
                sc.nextLine();

                int answer = -1;
                switch (input) {
                    case 1:
                        answer = recursive_multiply(a, b);
                        break;
                    case 2:
                        answer = recursive_div(a, b);
                        break;
                    case 3:
                        answer = recursive_mod(a, b);
                        break;
                }
                System.out.println("Answer: " + answer);
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("**Invalid input, not a choice! (0,1,2,3)**");
                System.out.println();
                sc.nextLine();
            }
        }

        sc.close();
    }
}
