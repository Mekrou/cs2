public class Question {
    private String question;
    private String answer;
    private String difficulty;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Question(String question, String answer, String difficulty)
    {
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
    }
}
