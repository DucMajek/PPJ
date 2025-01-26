import PPJ19.SemiTruck;
import PPJ19.Vehicle;
import PPJ19.WheeledVehicle;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(5, 300.5, "Concrete");
        FamilyHouse familyHouse = new FamilyHouse(2, 150.0, "Brick", 4, true);
        ApartmentBlock apartmentBlock = new ApartmentBlock(6,2,"Brick",6, false);
        Skyscraper skyscraper = new Skyscraper(10,3000,"Stone", 2, true, 5);

        System.out.println(building);
        System.out.println(familyHouse);
        System.out.println(apartmentBlock);
        System.out.println(skyscraper);
    }
}