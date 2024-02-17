import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            testSpawn();
        }
    }

    public static int spawn() {
        Random random = new Random();
        return random.nextInt(21);
    }

    public static void testSpawn() {
        int number = spawn();
        System.out.println(number);
        if (number > 20) {
            throw new Error("Over 20");
        }
        else if (number < 0) {
            throw new Error("Under 0");
        }
    }
}
