public class Person {
    private String name;
    private int birthYear;

    public Person(int birthYear, String name) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public Person(String name){
        this(1990,name);
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public static Person getOlder(Person person, Person person2) {
        return  person.getBirthYear() < person2.getBirthYear() ? person : person2;
    }

    public static Person getOldest(Person[] persons){
        Person oldestPerson;
        oldestPerson = persons[0];
        for(int i = 1; i < persons.length; i++){
            if(persons[i].getBirthYear() < oldestPerson.getBirthYear()){
                oldestPerson = persons[i];
            }
        }

        return oldestPerson;
    }

    public static Person[] sort(Person[] persons){

        for(int i = 0; i < persons.length; i++){
            for(int j = 0; j < persons.length - 1 - i; j++ ){
                if(persons[j].getBirthYear() > persons[j+1].getBirthYear()){
                    Person temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }

        return persons;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
