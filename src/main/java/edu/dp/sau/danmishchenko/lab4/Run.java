package edu.dp.sau.danmishchenko.lab4;

import edu.dp.sau.danmishchenko.lab4.controller.TypicalUniversityCreator;
import edu.dp.sau.danmishchenko.lab4.model.University;
import edu.dp.sau.danmishchenko.lab4.model.Faculty;
import edu.dp.sau.danmishchenko.lab4.model.Department;
import edu.dp.sau.danmishchenko.lab4.model.Group;
import edu.dp.sau.danmishchenko.lab4.model.Student;

import java.util.ArrayList;
import java.util.Random;

public class Run {
    public static void main(String[] args) {
        TypicalUniversityCreator typicalUniversityCreator = new TypicalUniversityCreator();
        University university = typicalUniversityCreator.createInstance();
        System.out.println(university.getName());
        Faculty faculty = university.getListOfContent().getFirst();
        System.out.println(faculty.getName());
        Department department = faculty.getListOfContent().getFirst();
        System.out.println(department.getName());
        Random random = new Random();
        int numberOfGroups = random.nextInt(3) + 1;
        for (int i = 0; i < numberOfGroups; i++) {
            Group group = department.getListOfContent().get(i);
            ArrayList<Student> studentList = (ArrayList<Student>) group.getListOfContent();
            System.out.println("\nGroup: " + group.getName());
            for (Student student : studentList) {
                System.out.println(student.getSurname() + " " + student.getFirstName() + " " + student.getPatronymic() + " " + student.getSex());
            }
        }
    }
}