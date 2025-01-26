public class Dzem {
    private String smak;
    private double waga;

    public Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public Dzem(String smak) {
        this.smak = smak;
    }

    public Dzem(double waga) {
        this.waga = waga;

    }

    public String getSmak() {
        return smak == "" || smak == null ? "No name" : this.smak;
    }

    public double getWaga() {
        return waga == 0 ? 100.0 : this.waga;
    }
}
