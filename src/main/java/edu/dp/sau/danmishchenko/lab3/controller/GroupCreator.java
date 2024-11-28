package edu.dp.sau.danmishchenko.lab3.controller;

import edu.dp.sau.danmishchenko.lab3.model.Student;
import edu.dp.sau.danmishchenko.lab3.model.Group;

public class GroupCreator extends EntityCreator<Student> {
    StudentCreator studentCreator = new StudentCreator();

    @Override
    protected String makeName() {
        return Integer.toString(random.nextInt(250) + 1) + "-" + Integer.toString(random.nextInt(25) + 1) + "-" + Integer.toString(random.nextInt(5) + 1);
    }

    public Group createInstance() {
        Group group = new Group();
        group.setHead(makeHead());
        group.setName(makeName());
        group.setListOfContent(makeListOfContent(studentCreator::createStudent));
        return (Group) group;
    }
}