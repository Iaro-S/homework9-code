package ro.fasttrackit.homework9.person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person implements PersonInfo {
    String firstName;
    String lastName;
    Date birthDay;
    String address;

    @Override
    public String fullName(String firstName, String lastName) {
        return "Full name is: " + firstName + " " + lastName;

    }

    public void calculateAge(int year, int month, int day) {
        LocalDate today = LocalDate.now ();
        LocalDate birthDay = LocalDate.of (year, month, day);
        Period age = Period.between (birthDay, today);
        System.out.println ("Person's age is: " + age.getYears () + " years");
    }
}

