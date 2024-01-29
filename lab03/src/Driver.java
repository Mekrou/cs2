public class Driver {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        boolean userQuit = false;
        while (!userQuit)
        {
            display_menu();
            int input = Integer.parseInt(Input.read_input(InputType.MENU_CHOICE));
            switch (input)
            {
                case 1:
                    quiz.add_question();
                    break;
                case 2:
                    quiz.remove_question();
                    break;
                case 3:
                    quiz.modify_question();
                    break;
                case 4:
                    quiz.give_quiz();
                    break;
                case 5:
                    userQuit = true;
                    System.out.println("Goodbye!");
                    break;
            }
        }


        Test.run();
        Input.closeScanner();
    }

    public static void display_menu()
    {
        System.out.println("1. Add a question to the quiz");
        System.out.println("2. Remove a question from the quiz");
        System.out.println("3. Modify a question in the quiz");
        System.out.println("4. Take the quiz");
        System.out.println("5. Quit");
    }
}
