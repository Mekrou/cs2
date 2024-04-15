import java.util.Random;

public class App {
    public static final int max = 10000;
    public static void main(String[] args) throws Exception {
        Prime prime = new Prime(max);
        Random rand = new Random();

        int num = rand.nextInt(max);
        while (num < 2 || prime.isPrime(num)) {
            num = rand.nextInt(max);
        }

        System.out.println("What primes make up " + num + "?");
        int gcf = findFactor(num, prime);
        while (gcf >= 2) {
            int nextTarget = num / gcf;
            if (nextTarget == 1) 
                System.out.print(gcf);
            else
                System.out.print(gcf + "x");
            num /= gcf;
            gcf = findFactor(num, prime);
        }
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
