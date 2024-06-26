import java.util.LinkedList;

public class Prime {
    private LinkedList<Integer> numbers;

    public Prime(int max) {
        numbers = new LinkedList<>();
        findPrimes(max);
    }

    private void findPrimes(int max) {
        LinkedList<Boolean> primeFlags = new LinkedList<>();

        for (int i = 0; i < max; i++) {
            primeFlags.add(i, true);
        }

        for (int i = 2; i <= Math.sqrt(max); i++) {
            for (int j = i + 1; j < max; j++) {
                if (j % i == 0) {
                    primeFlags.set(j, false);
                }
            }
        }

        for (int i = 2; i < max; i++) {
            if (primeFlags.get(i) == true) 
                numbers.add(i);
        }
    }

    public boolean isPrime(int number) {
        for (Integer num : numbers) {
            if (num == number)
                return true;
        }
        return false;
    }

    public int getPrime(int index) {
        return numbers.get(index);
    }

    public void printPrimes() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
