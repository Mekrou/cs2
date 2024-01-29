enum Difficulty {
    EASY(1),
    HARD(2),
    HARDCORE(3);

    private int value;
    private Difficulty(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}

public class Question {
    private String question;
    private String answer;
    private Difficulty difficulty;
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Question(String question, String answer, Difficulty difficulty)
    {
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
    }
}
