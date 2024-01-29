import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input()
    {
        this.sc = new Scanner(System.in);
    }
    enum InputType {
        QUESTION,
        ANSWER,
        DIFFICULTY,
        MENU_CHOICE,
    }

    public void read_input(InputType inputType) {
        switch (inputType) {
            case ANSWER:

                break;
            case QUESTION:
                sc.useDelimiter("\n");
                try {
                    String input = sc.next();
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case DIFFICULTY:

                break;
            case MENU_CHOICE:

                break;
            default:
                break;
        }
    }
}
