package ro.fasttrackit.homework9.person;

public abstract class DatabaseAdmin extends Employee {
    public String dbTechnology;

    public void DbTechnology(String dbTechnology) {
        this.dbTechnology = dbTechnology;
    }
}
