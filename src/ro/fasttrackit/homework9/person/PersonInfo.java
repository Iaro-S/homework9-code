package ro.fasttrackit.homework9.person;

import java.time.LocalDate;
import java.util.Date;

public interface PersonInfo {

    String fullName(String firstName, String lastName);

    public void calculateAge(int year,int month,int day);
}
