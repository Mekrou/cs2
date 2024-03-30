import java.io.File;
import java.util.Scanner;

public class NumberFileReader {
    private Scanner fileScan;

    public NumberFileReader() {
        try {
            File file = new File("numbers.txt");
            fileScan = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int readNumbers() {
        int sumOfSquares = 0;

        while (fileScan.hasNextInt()) {
            double square = Math.pow(fileScan.nextInt(), 2);
            sumOfSquares += square;
        }

        return sumOfSquares;
    }

    public static void main(String[] args) {
        NumberFileReader nfr = new NumberFileReader();
        System.out.println(nfr.readNumbers());
    }
}
