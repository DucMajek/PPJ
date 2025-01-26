public class Walec {
    private int promien;
    private int wysokosc;

    public Walec(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show() {
        System.out.println("Pole: " + 2 * Math.PI * this.promien * (this.wysokosc + this.promien));

        System.out.println("Objetosc: " + Math.PI * this.promien * this.promien * this.wysokosc);
    }

    public int getPromien() {
        return promien;
    }

    public int getWysokosc() {
        return wysokosc;
    }
}
