import java.util.ArrayList;


public class Quiz {


    private ArrayList<Question> questions;

    public Quiz()
    {
        this.questions = new ArrayList<Question>();
    }

    public void add_question() {
        Question qs = new_question();
        questions.add(qs);
    }
    public void remove_question() {
        if(!hasQuestions())
            return;

        print_questions();

        System.out.println();
        System.out.println("Which one would you like to remove? (type its number)");
        int input = Integer.parseInt(Input.read_input(InputType.SELECT_QUESTION));
        questions.remove(input - 1);
    }

    public void modify_question() {
        if (!hasQuestions())
            return;

        print_questions();

        System.out.println();
        System.out.println("Which one would you like to change? (type its number)");
        int input = Integer.parseInt(Input.read_input(InputType.SELECT_QUESTION));
        Question newQuestion = new_question();
        questions.set(input, newQuestion);
    }

    public void give_quiz() {

    }

    public void print_questions()
    {
        System.out.println("Current questions are: ");

        for (int i = 0; i < questions.size(); i++)
        {
            System.out.print(i + 1);
            System.out.println(": " + questions.get(i).getQuestion());
        }
    }

    public Question new_question()
    {
        System.out.print("What's the question?\nQuestion> ");
        String _question = Input.read_input(InputType.QUESTION);
        System.out.print("What's the answer to the question?\nAnswer> ");
        String _answer = Input.read_input(InputType.ANSWER);
        System.out.print("What's the difficulty of the question?\nDifficulty> ");
        String _difficulty = Input.read_input(InputType.DIFFICULTY);
        Question qs = new Question(_question, _answer, _difficulty);
        return qs;
    }

    public boolean hasQuestions()
    {
        if (questions.size() > 0)
            return true;
        else {
            System.out.println("There are no questions currently!");
            return false;
        }
    }
}
