public class SemiTruck extends  WheeledVehicle{
    double weight;
    public SemiTruck(String color, int numberOfAxles, double weight) {
        super(color, numberOfAxles);
        this.weight = weight;
    }


    public void startDriving(){
        System.out.println(weight > 11.0? "Driving is unsafe, engine start denied" : "Start Driving");
    }
}
