import java.util.*;

public class App {
    public static BlueRayCollection collection;
    public static Scanner kb;

    public static void main(String[] args) throws Exception {
        kb = new Scanner(System.in);
        collection = new BlueRayCollection();
        while (true) {
            try {
                print_menu();
                int choice = kb.nextInt();
                choice = resolveChoice(choice);
                if (choice == 0)
                    break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                kb.nextLine();
            }
        }
    }

    private static void print_menu() {
        System.out.println("0. Quit\n1. Add BlueRay to collection\n2. See collection");
    }

    /* Calls appropriate methods for choice selection
     * Returns choice number, 0 if quit.  */
    private static int resolveChoice(int choice) throws InputMismatchException {
        switch (choice) {
            case 0:
                System.out.println("Bye!");
                return 0;
            case 1:
                try {
                    BlueRayDisk disk = readNewDisk();
                    collection.add(disk.title, disk.director, disk.releaseDate, disk.cost);
                } catch (InputMismatchException e) {
                    throw e;
                }
                return 1;
            case 2:
                collection.show_all();
                return 2;
            default:
                throw new InputMismatchException();
        }
    }

    private static BlueRayDisk readNewDisk() throws InputMismatchException  {
        try {
            kb.nextLine(); 
            System.out.println("What is the title?");
            String title = kb.nextLine();
            System.out.println("What is the director?");
            String director = kb.nextLine();
            System.out.println("What is the year of release");
            int releaseDate = kb.nextInt();
            kb.nextLine();
            System.out.println("What is the cost?");
            double cost = kb.nextDouble();
            kb.nextLine();
            return new BlueRayDisk(title, director, releaseDate, cost);
        } catch (InputMismatchException e) {
            throw e;
        }
    }
}