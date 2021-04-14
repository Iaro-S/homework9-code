package ro.fasttrackit.homework9.person;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person ();
        System.out.println (person.fullName ("Popa", "Gigel"));
        person.calculateAge (1983, 06, 14);
    }
}