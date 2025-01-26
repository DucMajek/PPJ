public class Main {
    public static void main(String[] args) {
        double[] tab = new double[10];

        // wypelnienie losowymi wartościami + wyświetlanie całej zawartości
        for(int i = 0; i< tab.length; i++){
            tab[i] = Math.random() * 10;
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n=======================");
        //wyswietlanie liczby o indeksie parzystym
        for(int i = 0; i< tab.length; i++){
            System.out.print(i % 2 == 0? tab[i]: " ");
        }
        System.out.println("\n=======================");

        // elementy przekonwertowane na int i wyswietlanie nieparzystych
        for(int i = 0; i< tab.length; i++){
            tab[i] = (int)tab[i];
            if(tab[i] % 2 == 0) continue;
            System.out.print(tab[i] + " | ");
        }

    }
}