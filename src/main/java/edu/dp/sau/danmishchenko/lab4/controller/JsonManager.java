package edu.dp.sau.danmishchenko.lab4.controller;

import edu.dp.sau.danmishchenko.lab4.model.University;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class JsonManager implements JsonUniversity {
    public University deserializeUniversity(String fileName) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void serializeUniversity(University university) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("university.json")) {
            gson.toJson(university, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean removeUniversityJson() {
        File file = new File("university.json");
        return file.delete();
    }
}