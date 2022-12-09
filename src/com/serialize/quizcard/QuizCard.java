package com.serialize.quizcard;

public class QuizCard {

    String question;
    String answer;

    public QuizCard(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
