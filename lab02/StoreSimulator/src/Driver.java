import java.util.Scanner;

public class Driver {
    public Driver() {

    }

    public static void StartDriver() {
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);
    }

    public static void ReadInput() {
        Scanner sc = new Scanner(System.in);

        try {
            int input = sc.nextInt();
            while (input != 8) {
                switch (input) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    default:
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    public static void DisplayMenu() {
        System.out.println("1. Sold One Milk");
        System.out.println("2. Sold One Bread");
        System.out.println("3. Change price of Milk");
        System.out.println("4. Change price of Bread");
        System.out.println("5. Add Milk to Inventory");
        System.out.println("6. Add Bread to Inventory");
        System.out.println("7. See Inventory");
        System.out.println("8. Quit");
    }
}