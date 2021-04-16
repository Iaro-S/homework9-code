package ro.fasttrackit.homework9.person;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    private final String dbTechnology;
    private long salary;

    public DatabaseAdmin(String firstName, String lastName, LocalDate birthday, String address, long salary, String dbTech) {
        super (firstName, lastName, birthday, address, "DB_Admin", LocalDate.now ());
        this.dbTechnology = dbTech;
        this.salary = salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public long getSalary() {
        return Math.round (salary * 1.05);
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
