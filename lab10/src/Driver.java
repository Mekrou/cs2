public class Driver {
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
