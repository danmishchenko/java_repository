package edu.dp.sau.danmishchenko.lab4.controller;

import edu.dp.sau.danmishchenko.lab4.model.Department;
import edu.dp.sau.danmishchenko.lab4.model.Faculty;
import edu.dp.sau.danmishchenko.lab4.model.Student;

public class FacultyCreator extends EntityCreator<Department> {
    RandomGenerator randomGenerator = new RandomGenerator();
    HumanCreator humanCreator = new HumanCreator() {
        @Override
        protected Student createInstance() {
            return null;
        }
    };
    DepartmentCreator departmentCreator = new DepartmentCreator();

    @Override
    protected String makeName() {
        return "Faculty of " + randomGenerator.generateFaculty();
    }

    @Override
    public Faculty createInstance() {
        Faculty faculty = new Faculty();
        faculty.setHead(humanCreator.createHuman());
        faculty.setName(makeName());
        faculty.setListOfContent(makeListOfContent(departmentCreator::createInstance));
        return faculty;
    }
}