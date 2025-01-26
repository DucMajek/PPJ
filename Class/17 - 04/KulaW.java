public class KulaW {
    private double promien;
    private double objetosc;
    public KulaW(Walec walec) {
        this.promien = walec.getPromien();
        this.objetosc = (4.0 / 3.0) * Math.PI * Math.pow(this.promien, 3);
    }


    public KulaW(Kwadrat kwadrat) {
        this.promien = kwadrat.getBok() / (2 * Math.sqrt(2));
        this.objetosc = (4.0 / 3.0) * Math.PI * Math.pow(this.promien, 3);
    }

    public void show() {
        System.out.println("Promien kuli: " + this.promien);
        System.out.println("Objetosc kuli: " + this.objetosc);
    }
}
