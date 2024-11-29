package edu.dp.sau.danmishchenko.lab4.controller;

import edu.dp.sau.danmishchenko.lab4.model.Group;
import edu.dp.sau.danmishchenko.lab4.model.Department;

public class DepartmentCreator extends EntityCreator<Group> {
    RandomGenerator randomGenerator = new RandomGenerator();
    GroupCreator groupCreator = new GroupCreator();

    @Override
    protected String makeName() {
        return "Department of " + randomGenerator.generateDepartment();
    }

    @Override
    public Department createInstance() {
        Department department = new Department();
        department.setHead(makeHead());
        department.setName(makeName());
        department.setListOfContent(makeListOfContent(groupCreator::createInstance));
        return department;
    }
}