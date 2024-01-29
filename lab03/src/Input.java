import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);
    private static int[] menuOptions = {1,2,3,4,5};

    public static String read_input(InputType inputType) {

        String result = "";
        boolean inputSuccess = false;
        while (!inputSuccess)
        {
            switch (inputType) {
                case ANSWER:
                case QUESTION:
                    sc.useDelimiter("\n");
                    try {
                        String input = sc.next();
                        sc.nextLine();
                        result = input;
                        inputSuccess = true;
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case DIFFICULTY:
                    try {
                        String input = sc.next();
                        sc.nextLine();
                        String[] difficulties = {"easy", "hard", "hardcore"};
                        for (String difficulty : difficulties)
                        {
                            if (input.equals(difficulty))
                            {
                                result = input;
                                inputSuccess = true;
                            }
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case MENU_CHOICE:
                    try {
                        int input = sc.nextInt();
                        sc.nextLine();
                        for (int i : menuOptions)
                        {
                            if (input == i)
                            {
                                result = Integer.toString(input);
                                inputSuccess = true;
                            }
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                default:
                    break;
            }

            if (!inputSuccess)
                System.out.println("Invalid input!");
        }

        return result;
    }

    public static void closeScanner()
    {
        sc.close();
    }
}
