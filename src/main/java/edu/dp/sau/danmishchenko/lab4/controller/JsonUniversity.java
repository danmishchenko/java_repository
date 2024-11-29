package edu.dp.sau.danmishchenko.lab4.controller;

import edu.dp.sau.danmishchenko.lab4.model.University;

public interface JsonUniversity {
    University deserializeUniversity(String fileName);
    void serializeUniversity(University university);
    boolean removeUniversityJson();
}