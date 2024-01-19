import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Driver {
    static StockItem milk;
    static StockItem bread;

    public Driver() {
        milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        bread = new StockItem("1 Loaf of Bread", 1.98f, 30);
    }

    public static void ReadInput() {
        Scanner sc = new Scanner(System.in);

        try {
            int input = sc.nextInt();
            while (input != 8) {
                switch (input) {
                    case 1:
                        milk.lowerQuantity();
                        break;
                    case 2:
                        bread.lowerQuantity();
                        break;
                    case 3:
                        float newPrice = readPrice(sc);
                        milk.setPrice(input);
                        break;
                    case 4:
                        float newPrice = readPrice(sc);
                        bread.setPrice(input);
                        break;
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println(milk);
                        System.out.println(bread);
                        break;
                    default:
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    public static float readPrice(Scanner sc)
    {
        try {
            float input = sc.nextFloat();



            return input;
        } catch (Exception e) {
            // TODO: handle exception

            return 0.0f;
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