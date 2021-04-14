package ro.fasttrackit.homework9.person;

import java.util.Date;

public abstract class Employee extends Person {
    public Date dateOfEmployment;
    public String position;

    public abstract void getSalary();
}

