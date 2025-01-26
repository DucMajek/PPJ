import java.io.*;

public class Satelita {
    private String nazwa;
    private int waga;

    public Satelita(String nazwa, int waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }

    public static Satelita[] readFile(String filename) throws IOException {
        Satelita[] list = new Satelita[10];
        Satelita newSatelita;
        FileReader in = new FileReader(filename);
        BufferedReader br = new BufferedReader(in);
        String line;
        int counter = 0;
        while ((line = br.readLine()) != null) {
            String[] dane = line.split(";");
            newSatelita = new Satelita(dane[0], Integer.parseInt(dane[1]));
            list[counter++] = newSatelita;
        }
        return list;
    }

    public void writeFile(String filename) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
            bw.write(this.nazwa + ";" + this.waga);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("logi.txt", true));
        try {
            if (this.waga > 1000) {
                throw new Exception("Nie można wystartiwac - satekuta za ciężka");
            }
            System.out.println("Satelita " + this.nazwa + " wystartował");
        } catch (Exception e) {
            bw.write(e.getMessage());
        } finally {
            bw.close();
        }
    }


    @Override
    public String toString() {
        return
                this.nazwa + ' ' +
                        this.waga;
    }
}
