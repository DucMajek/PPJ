import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(2003,"Jacek Kumar");
        Person person1 = new Person("Maciej Kowalski");
        Person person2 = new Person(1923,"Kuba");
        Person person3 = new Person(1000,"Maciej");
        Person[] persons = {person,person1,person2,person3};

        System.out.println(persons[0].getName());
        System.out.println(persons[1].getBirthYear());
        System.out.println(Person.getOlder(person,person1));
        System.out.println(Person.getOldest(persons));
        System.out.println(Arrays.toString(Person.sort(persons)));
    }
}