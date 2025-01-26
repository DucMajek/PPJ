import java.awt.*;

public class Person {
    private String name;
    private int birthYear;
    private Car car;

    public Person(String name, int birthYear, Car car) {
        this.name = name;
        this.birthYear = birthYear;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Car getCar() {
        return car;
    }

    public static Car[] findAllCars(Person[] persons) {
        Car[] allPersonsCars;
        int count = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getCar() != null) {
                count++;
            }
        }

        allPersonsCars = fillArray(persons, count);

        return allPersonsCars;
    }

    public static Person[] fineOwners(Person[] persons, String make) {
        Person[] result = new Person[persons.length];
        int i = 0;
        for (Person person : persons) {
            if (person != null && person.getCar() != null && person.getCar().getMake().equals(make)) {
                result[i++] = person;
            }
        }
        Person[] wynik = new Person[i];
        System.arraycopy(persons, 0, wynik, 0, i);
        return wynik;
    }

    public static Color findColor(Person[] person, String name, int year) {
        for (int i = 0; i < person.length; i++) {
            if (person[i].getName().equals(name) && person[i].getBirthYear() == year)
                return person[i].getCar().getColor();
            else if (person[i].getCar() == null)
                return null;
        }
        return null;
    }

    private static Car[] fillArray(Person[] persons, int count) {
        Car[] allPersonsCars = new Car[count];
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getCar() != null) {
                allPersonsCars[i] = persons[i].getCar();
            }
        }
        return allPersonsCars;
    }

    @Override
    public String toString() {
        return this.name + " " + this.birthYear + " " + this.car;
    }
}
