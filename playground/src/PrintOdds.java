public class PrintOdds implements Runnable {
    private int bound;
    public static int id;
    private int _id;

    public PrintOdds(int b) {
        bound = b;
        _id = id + 1;
        id++;
    }

    public void print() {
        for (int k = 1; k < bound; k += 2)
            System.out.println("Thread: " + _id + ": " + k);
    }

    public void run() {
        print();
    }
}