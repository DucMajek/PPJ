import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        Satelita satelita = new Satelita("Test", 3000);
        Satelita satelita2 = new Satelita("Satelita", 400);
        satelita.writeFile("output.txt");
        satelita2.writeFile("output.txt");
        Satelita[] lista = Satelita.readFile("satelita.txt");

        /*for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println(lista[i]);
            }
        }*/

        satelita.start();
    }
}