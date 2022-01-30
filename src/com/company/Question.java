package com.company;

import java.util.ArrayList;

public abstract class Question {
    private String questionText;
    private ArrayList<String> answerChoices;
    private ArrayList<String> correctAnswers;
    private ArrayList<String> response = new ArrayList<>();
    private String instructions;

    public Question(String questionText, ArrayList<String> answerChoices, ArrayList<String> correctAnswers) {
        this.questionText = questionText;
        this.answerChoices = answerChoices;
        this.correctAnswers = correctAnswers;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public ArrayList<String> getResponse() {
        return response;
    }

    public void setResponse(ArrayList<String> response) {
        this.response = response;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public void displayQuestion() {
        System.out.println(getQuestionText());
    }

    public void displayAnswerChoices() {
        System.out.println(answerChoices.toString());
    }

    public void displayInstructions() {
        System.out.println(getInstructions());
    }

    public boolean gradeQuestion() {
        if (response.size() != getCorrectAnswers().size()) {
            System.out.println("Answer set wrong size.");
            System.out.println("Answer Choices size: " + getAnswerChoices().size());
            System.out.println("Correct Answers size: " + getCorrectAnswers().size());
            return false;
        } else {
            boolean grade = true;
            for (int i = 0; i < getAnswerChoices().size(); i++) {
                System.out.println("Answer choice " + i + " is: " + getAnswerChoices().get(i) + ".");
                System.out.println("Correct answer " + i + " is: " + getCorrectAnswers().get(i) + ".");
                if (getResponse().get(i) != getCorrectAnswers().get(i)) {
                    grade = false;
                }
            }
            return grade;
        }
    }
}
