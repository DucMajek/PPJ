public class FamilyHouse extends Building{

    int numberOfRooms;
    boolean hasGarden;

    public FamilyHouse(int numberOfFloors, double area, String material, int numberOfRooms, boolean hasGarden){
        super(numberOfFloors,area,material);
        this.numberOfRooms = numberOfRooms;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "FamilyHouse{" +
                "numberOfRooms=" + numberOfRooms +
                ", hasGarden=" + hasGarden +
                ", numberOfFloors=" + numberOfFloors +
                ", area=" + area +
                ", material='" + material + '\'' +
                '}';
    }
}
