import java.util.Random;

public class Baby implements Runnable {
    private int time;
    private String name;

    public Baby(String name)
    {
        this.name = name;
        Random random = new Random();
        this.time = random.nextInt(5000);
    }

    public void run() {
        try {
            System.out.println("My name is " + name + " and I am going to sleep for " + time + "ms!");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am awake, feed me!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Thread b1, b2, b3, b4, b5;
        b1 = birth("Noah");
        b2 = birth("Olivia");
        b3 = birth("Liam");
        b4 = birth("Emma");
        b5 = birth("Amelia");

        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
    }

    public static Thread birth(String name)
    {
        return new Thread(new Baby(name));
    }
}
