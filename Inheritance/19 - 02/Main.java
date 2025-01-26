import java.lang.ref.PhantomReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Red");
        WheeledVehicle wheeledVehicle = new WheeledVehicle("Blue", 5);
        SemiTruck semiTruck = new SemiTruck("Green", 4, 11.1);

        semiTruck.startDriving();
    }
}