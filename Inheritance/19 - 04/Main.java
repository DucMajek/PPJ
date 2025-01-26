import PPJ19.SemiTruck;
import PPJ19.Vehicle;
import PPJ19.WheeledVehicle;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[]{
                new Osoba("Jan","Kowalski","0000"),
                new Osoba("Olek","Kowalski","1111"),
                new Osoba("Rudy","Kowalski","4444"),
                new Osoba("Adam","Kowalski","3333"),
                new Osoba("Jola","Kowalska","2222")
        };
        Telefon[] phones = new Telefon[]{
                new Komorka("Android", "Red"),
                new Smartfon("Android", "Blue", osoby),
                new Telefon("Test", "Blue")
        };


        phones[0].zadzwon("1111");
        phones[1].zadzwon(osoby[0].getNumer());
        phones[0].zadzwon("3333");
        phones[1].zadzwon(osoby[1].getNumer());
        phones[0].zadzwon("5555");
        phones[1].zadzwon(osoby[2].getNumer());
        phones[0].zadzwon("7777");
        phones[1].zadzwon(osoby[3].getNumer());
        phones[0].zadzwon("9999");
        phones[1].zadzwon(osoby[4].getNumer());
        System.out.println("==============================================");
        phones[0].wyswietlHistoriePolaczen();
        phones[1].wyswietlHistoriePolaczen();
        phones[2].wyswietlHistoriePolaczen();


    }
}