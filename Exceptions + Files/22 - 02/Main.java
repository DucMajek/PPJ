import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];
        int count = 0;
        try {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                if (data.length > 3) {
                    people[count++] = new Person(data[0], Integer.parseInt(data[1]), new Car(data[2],
                            Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5])));
                } else {
                    people[count++] = new Person(data[0], Integer.parseInt(data[1]), null);
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Car[] cars = Person.findAllCars(people);
        Person[] persons = Person.fineOwners(people, "BMW");
        System.out.println(Person.findColor(people, "Jacek", 1980));

        for(Car car: cars){
            System.out.println(car);
        }

        for(Person per: persons){
            System.out.println(per);
        }

    }

}
