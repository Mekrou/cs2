public class FibIteration implements FindFib {
    public int calculate_fib(int number) {
        if (number <= 2 && number > 0)
            return 1;
        
        int lastNum = 1;
        int secondLastNum = 1;
        int fib = -1;
        for (int i = 1; i <= number - 2; i++) {
            fib = lastNum + secondLastNum;
            secondLastNum = lastNum;
            lastNum = fib;
        }
        return fib;
    }
}
