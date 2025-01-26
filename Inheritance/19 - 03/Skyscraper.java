public class Skyscraper extends ApartmentBlock{
    int numberOfElevators;

    public Skyscraper(int numberOfFloors, double area, String material, int numberOfApartments, boolean hasElevator, int numberOfElevators) {
        super(numberOfFloors, area, material, numberOfApartments, hasElevator);
        this.numberOfElevators = numberOfElevators;
    }

    @Override
    public String toString() {
        return "Skyscraper{" +
                "numberOfElevators=" + numberOfElevators +
                ", numberOfApartments=" + numberOfApartments +
                ", hasElevator=" + hasElevator +
                ", numberOfFloors=" + numberOfFloors +
                ", area=" + area +
                ", material='" + material + '\'' +
                '}';
    }
}
