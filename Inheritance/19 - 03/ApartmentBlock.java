public class ApartmentBlock extends Building{
    int numberOfApartments;
    boolean hasElevator;

    public ApartmentBlock(int numberOfFloors, double area, String material, int numberOfApartments, boolean hasElevator) {
        super(numberOfFloors, area, material);
        this.numberOfApartments = numberOfApartments;
        this.hasElevator = hasElevator;
    }

    @Override
    public String toString() {
        return "ApartmentBlock{" +
                "numberOfApartments=" + numberOfApartments +
                ", hasElevator=" + hasElevator +
                ", numberOfFloors=" + numberOfFloors +
                ", area=" + area +
                ", material='" + material + '\'' +
                '}';
    }
}
