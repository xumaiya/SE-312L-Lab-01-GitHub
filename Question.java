public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswerIndex;
    private String explanation;

    public Question(String questionText, String[] options, int correctAnswerIndex, String explanation) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.explanation = explanation;
    }

    // Getters
    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public String getExplanation() {
        return explanation;
    }

    public boolean isCorrect(int selectedAnswer) {
        return selectedAnswer == correctAnswerIndex;
    }
} 