import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Prime prime = new Prime(100);
        prime.printPrimes();
        System.out.println(prime.isPrime(6));
        System.out.println(prime.getPrime(2));
    }
}
