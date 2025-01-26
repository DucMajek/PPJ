public class Smartfon extends Komorka{
     Osoba[] znajomi;
    public Smartfon(String interfejsKomunikacyjny, String color, Osoba[] tab) {
        super(interfejsKomunikacyjny, color);
        this.znajomi = tab;
    }
    @Override
    public void zadzwon(String numer){
        super.zadzwon(numer);

    }
    @Override
    void wyswietlHistoriePolaczen() {
        System.out.println("Historia polaczen ze znajomymi:");
        for (String numer : listaPolaczen) {
            if (numer != null) {
                for (Osoba osoba : znajomi) {
                    if (osoba.getNumer().equals(numer)) {
                        System.out.println(osoba + " (numer: " + numer + ")");
                        break;
                    }
                }
            }
        }
    }

}
