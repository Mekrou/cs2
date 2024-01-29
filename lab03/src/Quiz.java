import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {
    private ArrayList<Question> questions;

    public Quiz()
    {
        this.questions = new ArrayList<Question>();
    }

    public void add_question() {
        System.out.print("What's the question?\nQuestion> ");
        String _question = Input.read_input(InputType.QUESTION);
        System.out.print("What's the answer to the question?\nAnswer> ");
        String _answer = Input.read_input(InputType.ANSWER);
        System.out.print("What's the difficulty of the question?\nDifficulty> ");
        String _difficulty = Input.read_input(InputType.DIFFICULTY);
        Question qs = new Question(_question, _answer, _difficulty);
        questions.add(qs);
    }
    public void remove_question() {
        System.out.println("Current questions are: ");

        for (int i = 0; i < questions.size(); i++)
        {
            System.out.print(i + 1);
            System.out.println(": " + questions.get(i).getQuestion());
        }

        System.out.println();
        System.out.println("Which one would you like to remove? (type its number)");
        int input =

    }

    public void modify_question() {

    }

    public void give_quiz() {

    }
}
