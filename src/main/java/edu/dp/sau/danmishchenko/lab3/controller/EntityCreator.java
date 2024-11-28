package edu.dp.sau.danmishchenko.lab3.controller;

import edu.dp.sau.danmishchenko.lab3.model.Entity;
import edu.dp.sau.danmishchenko.lab3.model.Student;
import edu.dp.sau.danmishchenko.lab3.model.Human;

import java.util.Random;
import java.util.ArrayList;
import java.util.function.Supplier;

public abstract class EntityCreator<T> {
    public abstract Entity createInstance();

    protected abstract String makeName();

    protected HumanCreator humanCreator = new HumanCreator() {
        @Override
        protected Student createInstance() {
            return null;
        }
    };
    protected Random random = new Random();

    protected Human makeHead() {
        return humanCreator.createHuman();
    }

    protected ArrayList<T> makeListOfContent(Supplier<T> creator) {
        int randomLength = random.nextInt(11) + 5;
        ArrayList<T> list = new ArrayList<>(randomLength);
        for (int i = 0; i < randomLength; i++) {
            list.add((T) creator.get());
        }
        return list;
    }
}