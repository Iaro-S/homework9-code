package ro.fasttrackit.homework9.person;

import java.time.LocalDate;

public interface Person {
    String getFirstName();

    String getLastName();

    LocalDate getBirthday();

    String getAddress();
}