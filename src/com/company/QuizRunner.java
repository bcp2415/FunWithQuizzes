package com.company;

import java.util.ArrayList;

public class QuizRunner {
    public static void main (String[] args) {
        Quiz test = new Quiz();

        ArrayList<String> answers1 = new ArrayList<>();
        answers1.add("Cheese");
        answers1.add("Sausage");
        answers1.add("Mamaliga");
        answers1.add("Cotton");
        ArrayList<String> correct1 = new ArrayList<>();
        correct1.add("A");
        test.addQuestion(new MultipleChoice("What is the moon made of?", answers1, correct1));

        ArrayList<String> answers2 = new ArrayList<>();
        answers2.add("Blue");
        answers2.add("Red");
        answers2.add("Orange");
        answers2.add("Yellow");
        ArrayList<String> correct2 = new ArrayList<>();
        correct2.add("A");
        test.addQuestion(new MultipleChoice("What is my favorite color?", answers2, correct2));

        ArrayList<String> answers3 = new ArrayList<>();
        answers3.add("3");
        answers3.add("4");
        answers3.add("5");
        answers3.add("6");
        answers3.add("7");
        ArrayList<String> correct3 = new ArrayList<>();
        correct3.add("A");
        correct3.add("C");
        correct3.add("E");
        test.addQuestion(new Checkbox("Which of these numbers are odd?", answers3, correct3));

        test.administerQuiz();

    }
}
