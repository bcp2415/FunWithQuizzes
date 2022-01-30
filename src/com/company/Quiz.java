package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> quiz;

    public Quiz() {
        this.quiz = new ArrayList<>();
    }

    public ArrayList<Question> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Question> quiz) {
        this.quiz = quiz;
    }

    public void addQuestion(Question aQuestion) {
        quiz.add(aQuestion);
    }

    public void removeQuestion(Question aQuestion) {
        quiz.remove(aQuestion);
    }

    public void administerQuiz() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < quiz.size(); i++) {

            quiz.get(i).displayQuestion();
            quiz.get(i).displayInstructions();
            quiz.get(i).displayAnswerChoices();
            ArrayList<String> allResponses = new ArrayList<>();

            String newResponse = in.nextLine();
            do {
                allResponses.add(newResponse);
                if (in.hasNextLine()) {
                    newResponse = in.nextLine();
                } else {
                    newResponse = "";
                }
            } while (newResponse != "");
            quiz.get(i).setResponse(allResponses);
            System.out.println("Your answers for Question " + i + " are: " + allResponses + ".");
        }
        in.close();

        System.out.println("Your score on this quiz was: " + gradeQuiz() + " out of " + quiz.size() + " questions.");
    }

    public int gradeQuiz() {
        int score = 0;
        for (int i = 0; i < quiz.size(); i++) {
            if (quiz.get(i).gradeQuestion()) {
                score++;
            }
        }
        return score;
    }
}
