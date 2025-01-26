public class Building {
    int numberOfFloors;
    double area;
    String material;

    public Building(int numberOfFloors, double area, String material) {
        this.numberOfFloors = numberOfFloors;
        this.area = area;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Building{" +
                "numberOfFloors=" + numberOfFloors +
                ", area=" + area +
                ", material='" + material + '\'' +
                '}';
    }
}
