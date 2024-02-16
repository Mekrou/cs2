import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Item[] myCollection = new Item[5];

        for (int i = 0; i < myCollection.length; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            
            char input = sc.next().charAt(0);
            sc.nextLine();

            switch (input) {
                case 'B':
                    myCollection[i] = queryItemType(new Book(), sc);
                    break;
                case 'P':
                    myCollection[i] = queryItemType(new Periodical(), sc);
                    break;
                default:
                    System.out.println("Invalid input. Quitting...");
                    return;
            }
        }

        System.out.println("Your Items:");

        for (Item item : myCollection) {
            System.out.println(item.getListing());
            System.out.println();
        }

        sc.close();
    }

    public static Item queryItemType(Item item, Scanner sc) {
        System.out.println("Please enter the name of the " + item.getClass().getName());
        String input = sc.nextLine();
        item.setTitle(input);

        if (item instanceof Book) {
            // Get author
            System.out.println("Please enter the author of the Book");
            input = sc.nextLine();
            Book book = (Book) item;
            book.setAuthor(input);
            
            // Get ISBN
            System.out.println("Please enter the ISBN of the Book");
            long isbn = sc.nextLong();
            sc.nextLine();
            book.setIsbn(isbn);
        } else if (item instanceof Periodical) {
            // Get Issue number
            System.out.println("Please enter the issue number");
            short issueNum = sc.nextShort();
            Periodical periodical = (Periodical) item;
            periodical.setIssueNum(issueNum);
        }

        return item;
    }
}
