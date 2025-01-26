public class Main {
    public static void main(String[] args) {
        Dzem dzem = new Dzem("Truskawka", 13.3);
        Dzem dzem1 = new Dzem("Truskawka");
        Dzem dzem2 = new Dzem(13.3);

        System.out.println(dzem.getSmak() + " " + dzem.getWaga());
        System.out.println(dzem1.getSmak() + " " + dzem1.getWaga());
        System.out.println(dzem2.getSmak() + " " + dzem2.getWaga());

    }
}