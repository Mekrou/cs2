import java.util.Scanner;

public class Driver {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        FibFormula fibFormula = new FibFormula();
        FibIteration fibIteration = new FibIteration();

        while (true) {
            try {
                System.out.print("Enter the number you want to find the Fibonacci Series for:\n$> ");
                int input = sc.nextInt();
                sc.nextLine();
                int formulaResult = fibFormula.calculate_fib(input);
                int iterationResult = fibIteration.calculate_fib(input);
                System.out.println("Fib of " + input + " by iteration is:  " + iterationResult);
                System.out.println("Fib of " + input + " by formula is:    " + formulaResult);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine();
            }
        }
        
        sc.close();
    }
}
