public class Numbers {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintOdds(10)); t1.start();
        Thread t2 = new Thread(new PrintOdds(23)); t2.start();
    }
}
