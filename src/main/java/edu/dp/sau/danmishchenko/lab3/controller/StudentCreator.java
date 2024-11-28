package edu.dp.sau.danmishchenko.lab3.controller;

import edu.dp.sau.danmishchenko.lab3.model.Student;

public class StudentCreator extends HumanCreator {
    @Override
    protected Student createInstance() {
        return new Student();
    }

    public Student createStudent() {
        return (Student) createHuman();
    }
}