public class FibFormula implements FindFib {
    public int calculate_fib(int number) {
        return (int) ((Math.pow((1 + Math.sqrt(5)) / 2, number) - Math.pow((1 - Math.sqrt(5)) / 2, number)) / Math.sqrt(5));
    }
}
