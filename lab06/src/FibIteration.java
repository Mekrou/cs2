public class FibIteration implements FindFib {
    public int calculate_fib(int number) {
        if (number <= 2 && number > 0)
            return 1;
        
        return calculate_fib(number - 1) + calculate_fib(number - 2);
    }

    public static void main(String[] arg) {
        FibIteration fib = new FibIteration();
        for (int i = 1; i < 11; i++) {
            System.out.println("Fib Result: " + fib.calculate_fib(i));
        }
    }
}
