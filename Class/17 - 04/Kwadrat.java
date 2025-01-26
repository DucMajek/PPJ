public class Kwadrat {
    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public void show() {
        System.out.println("Pole: " + this.bok * this.bok);

        System.out.println("Objetosc: " + this.bok * this.bok * this.bok);
    }

    public int getBok() {
        return bok;
    }
}
