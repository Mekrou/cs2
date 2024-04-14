import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        final int max = 10000;

        Prime prime = new Prime(100);
        int result = findFactor(10, prime);
        System.out.println(result);
    }

    public static int findFactor(int target, Prime prime) {
        for (int i = 0; i <= target; i++) {
            int currPrime = prime.getPrime(i);
            if ((target % currPrime) == 0) {
                return currPrime;
            }
        }
        return -1;
    }
}
