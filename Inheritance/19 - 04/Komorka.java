public class Komorka extends Telefon{
     String[] listaPolaczen;
    private  int count = 0;
    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        this.listaPolaczen = new String[10];
    }

    @Override
    public void zadzwon(String numer){
        super.zadzwon(numer);
        this.listaPolaczen[count++] = numer;
    }
    @Override
    void wyswietlHistoriePolaczen() {
        System.out.println("Historia polaczen:");
        for (String numer : listaPolaczen) {
            if (numer != null) {
                System.out.println(numer);
            }
        }
    }

}
