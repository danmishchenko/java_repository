package edu.dp.sau.danmishchenko.lab4.controller;

import edu.dp.sau.danmishchenko.lab4.model.Human;
import edu.dp.sau.danmishchenko.lab4.model.Student;

public abstract class HumanCreator {
    public Human createHuman() {
        Human human = new Student();
        RandomGenerator randomGenerator = new RandomGenerator();
        human.setSurname(randomGenerator.generateSurname());
        human.setFirstName(randomGenerator.generateFirstName());
        human.setPatronymic(randomGenerator.generatePatronymic());
        human.setSex(randomGenerator.generateSex());
        return human;
    }

    protected abstract Student createInstance();
}