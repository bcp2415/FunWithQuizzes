package com.company;

import java.util.ArrayList;

public class Checkbox extends Question {
    public Checkbox(String questionText, ArrayList<String> answerChoices, ArrayList<String> correctAnswers) {
        super(questionText, answerChoices, correctAnswers);
        setInstructions("Type the letter of your first correct choice, then Enter.  Keep typing letters, then press Enter without a choice to finish: ");
    }

    @Override
    public void displayAnswerChoices() {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        for (int i = 0; i < getAnswerChoices().size(); i++) {
            System.out.println(letters.get(i) + ": " + getAnswerChoices().get(i));
        }
    }
}

