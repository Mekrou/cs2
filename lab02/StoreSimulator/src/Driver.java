import java.util.Scanner;

public class Driver {
    static StockItem milk;
    static StockItem bread;

    public Driver() {
        milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        bread = new StockItem("1 Loaf of Bread", 1.98f, 30);
    }

    public void startDriver()
    {
        DisplayMenu();
        while (readMenuChoice())
        {
            DisplayMenu();
        }
    }

    private boolean readMenuChoice() {
        Scanner sc = new Scanner(System.in);

        try {
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    milk.lowerQuantity();
                    break;
                case 2:
                    bread.lowerQuantity();
                    break;
                case 3:
                    float newMilkPrice = readPrice(sc);
                    milk.setPrice(newMilkPrice);
                    break;
                case 4:
                    float newBreadPrice = readPrice(sc);
                    bread.setPrice(newBreadPrice);
                    break;
                case 5:
                    int newMilkQuantity = readQuantity(sc);
                    milk.raiseQuantity(newMilkQuantity);
                    break;
                case 6:
                    int newBreadQuantity = readQuantity(sc);
                    bread.raiseQuantity(newBreadQuantity);
                    break;
                case 7:
                    System.out.println(milk);
                    System.out.println(bread);
                    break;
                case 8:
                    sc.close();
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.nextLine();
            return true;
        }

        return true;
    }

    private float readPrice(Scanner sc) {
        boolean gotInput = false;
        float input = 0.0f;

        while (!gotInput) {
            try {
                input = sc.nextFloat();
                gotInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }

        return input;
    }

    private int readQuantity(Scanner sc) {
        boolean gotInput = false;
        int input = 0;

        while (!gotInput) {
            try {
                input = sc.nextInt();
                gotInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
            }
        }

        return input;
    }

    private void DisplayMenu() {
        System.out.println("1. Sold One Milk");
        System.out.println("2. Sold One Bread");
        System.out.println("3. Change price of Milk");
        System.out.println("4. Change price of Bread");
        System.out.println("5. Add Milk to Inventory");
        System.out.println("6. Add Bread to Inventory");
        System.out.println("7. See Inventory");
        System.out.println("8. Quit");
        System.out.println();
    }
}