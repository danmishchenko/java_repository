package edu.dp.sau.danmishchenko.lab3.controller;

import edu.dp.sau.danmishchenko.lab3.model.Faculty;
import edu.dp.sau.danmishchenko.lab3.model.Student;
import edu.dp.sau.danmishchenko.lab3.model.University;

public class TypicalUniversityCreator extends EntityCreator<Faculty> {
    HumanCreator humanCreator = new HumanCreator() {
        @Override
        protected Student createInstance() {
            return null;
        }
    };
    FacultyCreator facultyCreator = new FacultyCreator();

    @Override
    public University createInstance() {
        University university = new University();
        university.setHead(humanCreator.createHuman());
        university.setName(makeName());
        university.setListOfContent(makeListOfContent(facultyCreator::createInstance));
        return university;
    }

    @Override
    protected String makeName() {
        return "Typical University";
    }
}