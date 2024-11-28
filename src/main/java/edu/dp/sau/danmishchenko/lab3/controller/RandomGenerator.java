package edu.dp.sau.danmishchenko.lab3.controller;

import java.util.Random;
import java.util.ArrayList;

import edu.dp.sau.danmishchenko.lab3.model.Sex;

public class RandomGenerator {
    private Random random = new Random();
    private final ArrayList<String> faculties = new ArrayList<>();
    private final ArrayList<String> departments = new ArrayList<>();
    private final ArrayList<String> surnames = new ArrayList<>();
    private final ArrayList<String> firstNames = new ArrayList<>();
    private final ArrayList<String> patronymics = new ArrayList<>();

    public RandomGenerator() {
        faculties.add("Information Technology");
        faculties.add("Management");
        faculties.add("Natural Sciences and Technology");
        faculties.add("Financial and Economic");
        departments.add("Systems Analysis and Management");
        departments.add("Foreign Languages");
        departments.add("Economic Analysis and Finance");
        departments.add("Geodesy");
        surnames.add("Melʹnyk");
        surnames.add("Shevchenko");
        surnames.add("Kovalenko");
        surnames.add("Bondarenko");
        firstNames.add("M.");
        firstNames.add("S.");
        firstNames.add("A.");
        firstNames.add("D.");
        patronymics.add("D.");
        patronymics.add("O.");
        patronymics.add("I.");
        patronymics.add("M.");
    }

    public String generateFaculty() {
        return faculties.get(random.nextInt(faculties.size()));
    }

    public String generateDepartment() {
        return departments.get(random.nextInt(departments.size()));
    }

    public String generateSurname() {
        return surnames.get(random.nextInt(surnames.size()));
    }

    public String generateFirstName() {
        return firstNames.get(random.nextInt(firstNames.size()));
    }

    public String generatePatronymic() {
        return patronymics.get(random.nextInt(patronymics.size()));
    }

    public Sex generateSex() {
        if (random.nextBoolean()) {
            return Sex.MALE;
        }
        return Sex.FEMALE;
    }
}